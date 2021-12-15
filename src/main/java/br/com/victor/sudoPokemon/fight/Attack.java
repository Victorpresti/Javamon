package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.pokemon.Moves;
import br.com.victor.sudoPokemon.pokemon.Pokemon;

import java.util.Random;

/*
This class manages everything related to attacking the opposing Pokemon
 */
public class Attack {

    DamageHandler dh = new DamageHandler();
    Random rand = new Random();
    StatusManager statusManager = new StatusManager();

    public void playerAttack(Pokemon attacker, Pokemon defender, Moves selectedMove){
        System.out.println("----- Player Attack -----");
        attack(attacker, defender, selectedMove);
    }

    public void enemyAttack(Pokemon attacker, Pokemon defender){
        System.out.println("----- Opponent Attack -----");
        attack(attacker, defender, attacker.getMoves().get(rand.nextInt(attacker.getMoves().size())));
    }


    private void attack(Pokemon attacker, Pokemon defender, Moves selectedMove){

        int damageDealt;

        System.out.println(attacker.getName() + " uses " + selectedMove.getName());

        /*
        Checks if the move misses
         */
        if(checkAccuracy(selectedMove)){
            damageDealt = dh.adjustDamage(selectedMove, attacker, defender);
            System.out.println(defender.getName() + " loses " + damageDealt + " Hitpoints");
            loseHP(defender, damageDealt);

            /*
            Checks for additional effects on the move used
             */
            if(selectedMove.getAdditionalEffect()){
                statusManager.manage(attacker, defender, selectedMove, rand.nextInt(100) + 1);
            }

        } else {
            System.out.println("But it missed!");
        }
    }

    /*
    Handles the HP lost during an attack
     */
    private void loseHP(Pokemon defender, int damageDealt){
        defender.getCurrentStats().setHitpoints(defender.getCurrentStats().getHitpoints() - damageDealt);
        if (defender.getCurrentStats().getHitpoints() < 0) defender.getCurrentStats().setHitpoints(0);
        System.out.println(defender.getName() + " has " + defender.getCurrentStats().getHitpoints() + " Hitpoints");
    }

    /*
    Simple accuracy check, returns true or false
     */
    private boolean checkAccuracy(Moves move){
        Random rand = new Random();
        return move.getAccuracy() - 1 >= rand.nextInt(100);
    }

}
