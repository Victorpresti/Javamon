package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.lobby.Lobby;
import br.com.victor.sudoPokemon.player.Player;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.pokemon.Status;

import java.util.Scanner;

public class Battle {

    private int turnCount = 1;
    final String newLine = System.getProperty("line.separator");
    final Scanner sc= new Scanner(System.in);
    final Turn turn = new Turn();

    public void pokemonBattle(Player playerOne, Player playerTwo){
        announce(playerOne, playerTwo);
        while(!playerOne.isDefeated() || !playerTwo.isDefeated()){
            if (turnCount > 1){
                System.out.println(newLine + newLine);
            }
            System.out.println("----- Turn " + turnCount + " -----");


            turn.newTurn(playerOne, playerTwo);


            turnCount++;
        }

        turnCount = 1;
        endMatchAnnounce(playerOne, playerTwo);
        postMatch(playerOne, playerTwo);
    }


    private void announce(Player playerOne, Player playerTwo){
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------   BATTLE   ------------------");
        System.out.println("-----------------------------------------------");

        System.out.println("A battle between " + playerOne.getName() + " and " + playerTwo.getName() + " has started");
    }

    private void endMatchAnnounce(Player playerOne, Player playerTwo){
        if (playerOne.isDefeated()){
            System.out.println(playerOne.getName() + " has been defeated!");
        } else {
            System.out.println(playerTwo.getName() + " has been defeated!");
        }
    }

    private void postMatch(Player playerOne, Player playerTwo){
        System.out.println("Rematch?");
        String playerAnswer = sc.next().toLowerCase();
        //if (playerAnswer.equals("yes")) pokemonBattle(reset(player, player.getMaxHitpoints()), reset(enemy, enemy.getMaxHitpoints()));
        new Lobby().lobby();
    }

    private Pokemon reset(Pokemon pokemon, int hitpoints){
        pokemon.setStatus(Status.HEALTHY);
        pokemon.getCurrentStats().setHitpoints(hitpoints);
        return pokemon;
    }
}
