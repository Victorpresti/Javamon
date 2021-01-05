package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.Pokemon;
import br.com.victor.sudoPokemon.Status;
import br.com.victor.sudoPokemon.lobby.Lobby;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Battle {

    private int turnCount = 1;
    String newLine = System.getProperty("line.separator");
    Scanner sc= new Scanner(System.in);
    Turn turn = new Turn();

    public void pokemonBattle(Pokemon playerPokemon, Pokemon enemyPokemon){
        announce(playerPokemon, enemyPokemon);
        while(playerPokemon.getCurrentStats().getHitpoints() > 0 && enemyPokemon.getCurrentStats().getHitpoints() > 0){
            if (turnCount > 1){
                System.out.println(newLine + newLine);
            }
            System.out.println("----- Turn " + turnCount + " -----");


            turn.newTurn(playerPokemon, enemyPokemon);


            turnCount++;
        }

        turnCount = 1;
        endMatchAnnounce(playerPokemon, enemyPokemon);
        postMatch(playerPokemon, enemyPokemon);
    }


    private void announce(Pokemon p1, Pokemon p2){
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------   BATTLE   ------------------");
        System.out.println("-----------------------------------------------");

        System.out.println("A battle between " + p1.getName() + " and " + p2.getName() + " has started");
    }

    private void endMatchAnnounce(Pokemon p1, Pokemon p2){
        if (p1.getBaseStats().getHitpoints() == 0){
            System.out.println(p1.getName() + " has been defeated!");
        } else {
            System.out.println(p2.getName() + " has been defeated!");
        }
    }

    private void postMatch(Pokemon player, Pokemon enemy){
        System.out.println("Rematch?");
        String playerAnswer = sc.next().toLowerCase();
        if (playerAnswer.equals("yes")) pokemonBattle(reset(player, player.getMaxHitpoints()), reset(enemy, enemy.getMaxHitpoints()));
        new Lobby().lobby();
    }

    private Pokemon reset(Pokemon pokemon, int hitpoints){
        pokemon.setStatus(Status.HEALTHY);
        pokemon.getCurrentStats().setHitpoints(hitpoints);
        return pokemon;
    }
}
