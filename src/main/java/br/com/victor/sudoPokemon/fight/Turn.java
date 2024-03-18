package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.player.Player;
import br.com.victor.sudoPokemon.pokemon.Moves;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.utils.ScannerAux;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Turn {

    final Attack attack = new Attack();
    int selectedNumber = 0;
    final StatusManager statusMan = new StatusManager();
    final SpeedManager speedMan = new SpeedManager();

    /*
    It manages the entire turn, from the battle menu until the results are posted
     */
    public void newTurn(Player playerOne, Player playerTwo){
        /*
        The battle menu, where the player will select it's action
         */
        battleMenu(playerOne, playerTwo);
        /*
        Calculate who is first based on Speed
         */
        LinkedHashMap<String, Pokemon> speedOrder = speedMan.checkSpeed(playerOne, playerTwo);
        /*
        Order the attack based on the previous speed test result
         */
        attackOrder(speedOrder, playerPokemon.getMoves().get(selectedNumber - 1));
        /*
        Post turn effects
         */
        statusMan.postTurn(playerOne);
        statusMan.postTurn(playerTwo);
    }

    /*
    Use the SpeedManager results to order the attacks, also checks if the Pokemon actually has HP to attack
     */
    private void attackOrder(Map<String,Pokemon> speedOrder, Moves move){

        List<Pokemon> pokemonOrder = new ArrayList<>(speedOrder.values());
        Pokemon p1 = pokemonOrder.get(0);
        Pokemon p2 = pokemonOrder.get(1);

        if (speedOrder.keySet().stream().findFirst().get().equals("Player")) {
            attack.playerAttack(p1, p2, move);
            if(p1.getCurrentStats().getHitpoints() > 0 && p2.getCurrentStats().getHitpoints() > 0){
                attack.enemyAttack(p2, p1);
            }
        } else {
            attack.enemyAttack(p2, p1);
            if(p1.getCurrentStats().getHitpoints() > 0 && p2.getCurrentStats().getHitpoints() > 0){
                attack.playerAttack(p1, p2, move);
            }
        }
    }

    /*
    This class controls the selection of moves, displaying them in a menu
     */
    private void moveSelector(Player playerOne, Player playerTwo){

        AtomicInteger moveCounter = new AtomicInteger(1);
        AtomicInteger movePoolCounter = new AtomicInteger(0);

        System.out.println("Select a move, 0 goes back to the previous menu:");
        playerOne.getCurrentPokemon().getMoves().forEach(move -> {
            System.out.println("(" + moveCounter + ")" + playerOne.getCurrentPokemon().getMoves().get(Integer.parseInt(String.valueOf(movePoolCounter))).getName());
            movePoolCounter.getAndIncrement();
            moveCounter.getAndIncrement();
        });

        selectedNumber = ScannerAux.scanInt();

        if (selectedNumber == 0){
            battleMenu(playerOne, playerTwo);
        }
    }

    /*
    This method controls the action menu, where you'll select between Fighting, changing Pokemon, using your Items or Running
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
    private void battleMenu(Player playerOne, Player playerTwo){
        switch(actionSelecter()){
            case 1:
                moveSelector(playerOne, playerTwo);
                break;
            case 2:
                System.out.println("TODO");
                System.out.println("Back to the menu");
                battleMenu(playerOne, playerTwo);
                break;
            case 3:
                System.out.println("TODO");
                System.out.println("Back to the menu");
                battleMenu(playerOne, playerTwo);
                break;
            case 4:
                System.out.println("TODO");
                System.out.println("Back to the menu");
                battleMenu(playerOne, playerTwo);
                break;
        }
    }

}
