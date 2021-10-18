package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.pokemon.Moves;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.List;

/*
This class handles everything damage related
 */
public class DamageHandler {

    //Damage formula = ((((2 * Level)/5 + 2) * Move Power * Attack/Defense)/50 + 2) * Modifiers

    public int adjustDamage(Moves attackerMove, Pokemon attacker, Pokemon defender) {

        if (attackerMove.getDamageCategory().equals("Special")) {

               return (int) Math.round(((((((2.0 * attacker.getCurrentStats().getLevel()) / 5.0) + 2.0) * attackerMove.getDamage() *
                    ((double)attacker.getCurrentStats().getSpecialAttack() / (double) defender.getCurrentStats().getSpecialDefense())) / 50.0) + 2.0)  * modifiers(attackerMove, attacker, defender));

        } else if (attackerMove.getDamageCategory().equals("Physical")) {

            return (int) Math.round(((((((2.0 * attacker.getCurrentStats().getLevel()) / 5.0) + 2.0) * attackerMove.getDamage() *
                    ((double) attacker.getCurrentStats().getAttack() / (double)defender.getCurrentStats().getDefense())) / 50.0) + 2.0) * modifiers(attackerMove, attacker, defender));
        } else {
            return 0;
        }
    }


    /*
    This method applies every modifier, those being the randomness of the damage, effectiveness and STAB
     */
    private double modifiers(Moves attackerMove, Pokemon attacker, Pokemon defender){
        double modifier = checkEffectiveness(attackerMove, defender) * checkSTAB(attackerMove.getType(), attacker.getType());
        double min = modifier * 0.85;
        double max = modifier * 1.00;
        return Math.round(((Math.random() * (max - min)) + min) * 100.0) / 100.0;
    }

    private double checkEffectiveness(Moves move, Pokemon defender){

        /*
         Check if selected move is super ineffective, 1/4
         */
        if (defender.getSuperStrengths().contains(move.getType())) {
            System.out.println("It's not very effective!");
            return 0.25;
        }

        /*
         Check if selected move is ineffective, 1/2
         */
        if (defender.getStrengths().contains(move.getType())) {
            System.out.println("It's not very effective!");
            return 0.5;
        }

        /*
         Check if selected move is effective, 2x
         */
        if (defender.getWeaknesses().contains(move.getType())) {
            System.out.println("It's super effective!");
            return 2;
        }

        /*
         Check if selected move is super effective, x4
         */
        if (defender.getSuperWeaknesses().contains(move.getType())) {
            System.out.println("It's super effective!");
            return 4;
        }

        /*
         Check if selected move is not effective, x0
         */
        if (defender.getIneffective().contains(move.getType())) {
            System.out.println("It has no effect");
            return 0;
        }

        return 1;
    }

    /*
    This private implementation checks for STAB
    It checks for STAB separately for Pokemons with 1 or 2 types
    */
    private double checkSTAB(Type moveType, List<Type> attackerType) {
        if (attackerType.size() == 1){
            if (moveType.equals(attackerType.get(0))) {
                return 1.5;
            }
        }

        if (attackerType.size() == 2){
            if(moveType.equals(attackerType.get(0)) || moveType.equals(attackerType.get(1))){
                return 1.5;
            }
        }
        return 1.0;
    }
}
