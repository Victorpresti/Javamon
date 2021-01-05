package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.Moves;
import br.com.victor.sudoPokemon.Pokemon;
import br.com.victor.sudoPokemon.Type;

import java.util.List;

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


    private double modifiers(Moves attackerMove, Pokemon attacker, Pokemon defender){
        double modifier = checkEffectiveness(attackerMove, defender) * checkSTAB(attackerMove.getType(), attacker.getType());
        double min = modifier * 0.85;
        double max = modifier * 1.00;
        return Math.round(((Math.random() * (max - min)) + min) * 100.0) / 100.0;
    }

    private double checkEffectiveness(Moves move, Pokemon defender){

        //Checa se o golpe selecionado é super inefetivo (0/4)
        if (defender.getSuperStrengths().contains(move.getType())) {
            System.out.println("It's not very effective!");
            return 0.25;
        }

        //Checa se o golpe selecionado é inefetivo (0/2)
        if (defender.getStrengths().contains(move.getType())) {
            System.out.println("It's not very effective!");
            return 0.5;
        }

        //Checa se o golpe selecionado é efetivo (2x)
        if (defender.getWeaknesses().contains(move.getType())) {
            System.out.println("It's super effective!");
            return 2;
        }

        //Checa se o golpe selecionado é super efetivo (4x)
        if (defender.getSuperWeaknesses().contains(move.getType())) {
            System.out.println("It's super effective!");
            return 4;
        }

        //Checa se o golpe selecionado não tem efeito (0)
        if (defender.getIneffective().contains(move.getType())) {
            System.out.println("It has no effect");
            return 0;
        }

        return 1;
    }

    private double checkSTAB(Type moveType, List<Type> attackerType) {

        //Checa por STAB em pokemons com 1 tipo
        if (attackerType.size() == 1){
            if (moveType.equals(attackerType.get(0))) {
                return 1.5;
            }
        }

        //Checa por STAB em pokemons com 2 tipos
        if (attackerType.size() == 2){
            if(moveType.equals(attackerType.get(0)) || moveType.equals(attackerType.get(1))){
                return 1.5;
            }
        }
        return 1.0;
    }
}
