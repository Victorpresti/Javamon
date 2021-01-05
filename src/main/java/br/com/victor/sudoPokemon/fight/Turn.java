package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.Moves;
import br.com.victor.sudoPokemon.Pokemon;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Turn {

    Attack attack = new Attack();
    Scanner sc = new Scanner(System.in);
    int selectedNumber = 0;
    StatusManager manager = new StatusManager();

    public void newTurn(Pokemon playerPokemon, Pokemon enemyPokemon){

        battleMenu(playerPokemon, enemyPokemon);
        bothAttack(playerPokemon, enemyPokemon, playerPokemon.getMoves().get(selectedNumber - 1));
        manager.postTurn(playerPokemon);
        manager.postTurn(enemyPokemon);

    }

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

    private void moveSelector(Pokemon playerPokemon, Pokemon enemyPokemon){

        AtomicInteger moveCounter = new AtomicInteger(1);
        AtomicInteger movePoolCounter = new AtomicInteger(0);

        System.out.println("Select a move, 0 goes back to the previous menu:");
        playerPokemon.getMoves().forEach(move -> {
            System.out.println("(" + moveCounter + ")" + playerPokemon.getMoves().get(Integer.parseInt(String.valueOf(movePoolCounter))).getName());
            movePoolCounter.getAndIncrement();
            moveCounter.getAndIncrement();
        });

        selectedNumber = sc.nextInt();

        if (selectedNumber == 0){
            battleMenu(playerPokemon, enemyPokemon);
        }
    }

    private int actionSelecter(){
        System.out.println("Choose your action: ");
        System.out.println("(1) Fight: ");
        System.out.println("(2) Pokemon: ");
        int action = sc.nextInt();
        if(action < 1 || action > 4){
            System.out.println("Invalid action");
            return actionSelecter();
        }
        return action;
    }

    private void battleMenu(Pokemon playerPokemon, Pokemon enemyPokemon){
        switch(actionSelecter()){
            case 1:
                moveSelector(playerPokemon, enemyPokemon);
                break;
            case 2:
                break;
        }
    }

}
