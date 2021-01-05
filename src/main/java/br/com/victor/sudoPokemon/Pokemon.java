package br.com.victor.sudoPokemon;

import lombok.Data;

import java.util.*;

@Data
public class Pokemon {

    private int dexNumber;
    private String name;
    private List<Moves> moves;
    private List<Type> type;
    private List<Type> strengths;
    private List<Type> superStrengths;
    private List<Type> weaknesses;
    private List<Type> superWeaknesses;
    private List<Type> ineffective;
    private Stats baseStats;
    private Stats currentStats;
    private int maxHitpoints;
    private Status status;

    public Pokemon(int dex, String name, Type type, List<List<Type>> effectiveness, Stats baseStats){
        this.dexNumber = dex;
        this.name = name;
        this.type = new ArrayList<>(Collections.singleton(type));
        this.strengths = effectiveness.get(0);
        this.superStrengths = effectiveness.get(1);
        this.weaknesses = effectiveness.get(2);
        this.superWeaknesses = effectiveness.get(3);
        this.ineffective = effectiveness.get(4);
        this.baseStats = baseStats;
        this.currentStats = new Stats(1, 1, 1, 1, 1, 1, 1);
        this.status = Status.HEALTHY;
        this.maxHitpoints = 0;
        calculateStats();
        moves = new ArrayList<>();
    }

    public Pokemon(int dex, String name, Type type, Type type2, List<List<Type>> effectiveness, Stats baseStats){
        this.dexNumber = dex;
        this.name = name;
        this.type = Arrays.asList(type, type2);
        this.strengths = effectiveness.get(0);
        this.superStrengths = effectiveness.get(1);
        this.weaknesses = effectiveness.get(2);
        this.superWeaknesses = effectiveness.get(3);
        this.ineffective = effectiveness.get(4);
        this.baseStats = baseStats;
        this.currentStats = new Stats(1, 1, 1, 1, 1, 1, 1);
        this.status = Status.HEALTHY;
        this.maxHitpoints = 0;
        calculateStats();
        moves = new ArrayList<>();
    }

    public void addMoves(List<Moves> moves){
            this.moves = moves;
    }

    public void addMoves(Moves move){
        if (this.moves.size() <= 3) {
            this.moves.add(move);
        } else {
            System.out.println("You can't have more than 4 moves");
        }
    }

    private void calculateStats(){
        //Formula HP [ ( ( ( [ (2 * Base + IV + [EV/4]) * Level) / 100 ] + Level + 10
        //Formula outros Stats [ ( ( [ (2 * Base + IV + [EV/4]) * Level ] +5 ) / 100 ) * Nature]
        this.currentStats.setHitpoints(
                Math.floorDiv((2 * this.baseStats.getHitpoints() + (new Random().nextInt(31) + 1) + 0) * this.currentStats.getLevel(), 100) + this.currentStats.getLevel() + 10
        );

        this.currentStats.setAttack(
                (Math.floorDiv((2 * this.baseStats.getAttack() + (new Random().nextInt(31) + 1) + 0) * this.currentStats.getLevel(), 100) + 5) * 1
        );

        this.currentStats.setDefense(
                (Math.floorDiv((2 * this.baseStats.getDefense() + (new Random().nextInt(31) + 1) + 0) * this.currentStats.getLevel(), 100) + 5) * 1
        );

        this.currentStats.setSpecialAttack(
                (Math.floorDiv((2 * this.baseStats.getSpecialAttack() + (new Random().nextInt(31) + 1) + 0) * this.currentStats.getLevel(), 100) + 5) * 1
        );

        this.currentStats.setSpecialDefense(
                (Math.floorDiv((2 * this.baseStats.getSpecialDefense() + (new Random().nextInt(31) + 1) + 0) * this.currentStats.getLevel(), 100) + 5) * 1
        );

        this.currentStats.setSpeed(
                (Math.floorDiv((2 * this.baseStats.getSpeed() + (new Random().nextInt(31) + 1) + 0) * this.currentStats.getLevel(), 100) + 5) * 1
        );
    }

    public void changeLevel(int level){
        this.getCurrentStats().setLevel(level);
        calculateStats();
        this.maxHitpoints = this.getCurrentStats().getHitpoints();
    }

}
