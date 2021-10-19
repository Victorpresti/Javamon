package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.pokemon.Moves;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.utils.ScannerAux;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Turn {

    Attack attack = new Attack();
    int selectedNumber = 0;
    StatusManager manager = new StatusManager();

    /*
    It manages the entire turn, from the battle menu until the results are posted
     */
    public void newTurn(Pokemon playerPokemon, Pokemon enemyPokemon){
        battleMenu(playerPokemon, enemyPokemon);
        bothAttack(playerPokemon, enemyPokemon, playerPokemon.getMoves().get(selectedNumber - 1));
        manager.postTurn(playerPokemon);
        manager.postTurn(enemyPokemon);
    }

    /*
    Decides who'll attack first based on speed, also checks if the Pokemon actually has HP to attack
    TODO Speed tie
     */
    private void bothAttack(Pokemon playerPokemon, Pokemon enemyPokemon, Moves move){
        if (playerPokemon.getCurrentStats().getSpeed() > enemyPokemon.getCurrentStats().getSpeed()) {
            attack.playerAttack(playerPokemon, enemyPokemon, move);
            if(playerPokemon.getCurrentStats().getHitpoints() > 0 && enemyPokemon.getCurrentStats().getHitpoints() > 0){
                attack.enemyAttack(enemyPokemon, playerPokemon);
            }
        } else {
            attack.enemyAttack(enemyPokemon, playerPokemon);
            if(playerPokemon.getCurrentStats().getHitpoints() > 0 && enemyPokemon.getCurrentStats().getHitpoints() > 0){
                attack.playerAttack(playerPokemon, enemyPokemon, move);
            }
        }
    }

    /*
    This class controls the selection of moves, displaying them in a menu
     */
    private void moveSelector(Pokemon playerPokemon, Pokemon enemyPokemon){

        AtomicInteger moveCounter = new AtomicInteger(1);
        AtomicInteger movePoolCounter = new AtomicInteger(0);

        System.out.println("Select a move, 0 goes back to the previous menu:");
        playerPokemon.getMoves().forEach(move -> {
            System.out.println("(" + moveCounter + ")" + playerPokemon.getMoves().get(Integer.parseInt(String.valueOf(movePoolCounter))).getName());
            movePoolCounter.getAndIncrement();
            moveCounter.getAndIncrement();
        });

        selectedNumber = ScannerAux.scanInt();

        if (selectedNumber == 0){
            battleMenu(playerPokemon, enemyPokemon);
        }
    }

    /*
    This method controls the action menu, where you'll select between Fighting, changing Pokemon, using your Items or Running
    TODO Item and Run
     */
    private int actionSelecter(){
        int action = 0;
        System.out.println("Choose your action: ");
        System.out.println("(1) Fight ");
        System.out.println("(2) Pokemon ");
        System.out.println("(3) Item ");
        System.out.println("(4) Run ");
        action = ScannerAux.scanInt();
        if(action < 1 || action > 4){
            System.out.println("Invalid action");
            return actionSelecter();
        }
        return action;
    }

    /*
    Private implementation of the Action Selector
    TODO Case 2, 3 and 4.
     */
    private void battleMenu(Pokemon playerPokemon, Pokemon enemyPokemon){
        switch(actionSelecter()){
            case 1:
                moveSelector(playerPokemon, enemyPokemon);
                break;
            case 2:
                System.out.println("TODO");
                System.out.println("Back to the menu");
                battleMenu(playerPokemon, enemyPokemon);
                break;
            case 3:
                System.out.println("TODO");
                System.out.println("Back to the menu");
                battleMenu(playerPokemon, enemyPokemon);
                break;
            case 4:
                System.out.println("TODO");
                System.out.println("Back to the menu");
                battleMenu(playerPokemon, enemyPokemon);
                break;
        }
    }

}
