package br.com.victor.sudoPokemon.lobby;

import br.com.victor.sudoPokemon.fight.Battle;
import br.com.victor.sudoPokemon.pokemon.Moves;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.utils.ScannerAux;

import java.util.Arrays;

public class Lobby {

    final SearchPokemon sp = new SearchPokemon();
    final Battle bt = new Battle();

    public void lobby() {

        System.out.println("----------------------------------------------");
        System.out.println("-----------------   LOBBY   ------------------");
        System.out.println("----------------------------------------------");

        //Build your team
        //new BuildTeam().teamBuilder();

        /*
        Player chooses it's Pokemon
         */
        Pokemon a1 = sp.pokemonSearch();
        Pokemon a1c = a1.clone(a1);

        /*
        Player chooses the opponent's Pokemon
         */
        Pokemon b1 = sp.pokemonSearch();
        Pokemon b1c = b1.clone(b1);

        /*
        Changing level
         */
        a1c.changeLevel(50);
        b1c.changeLevel(50);

        /*
        Adding moves
         */
        a1c.addMoves(Arrays.asList(Moves.FIRE_BLAST, Moves.BLIZZARD, Moves.THUNDER, Moves.HYDRO_PUMP));
        b1c.addMoves(Arrays.asList(Moves.FIRE_BLAST, Moves.BLIZZARD, Moves.THUNDER, Moves.HYDRO_PUMP));

        /*
        Battle!
         */
        bt.pokemonBattle(a1c, b1c);
    }



    /*
    Level the Pokemon
     */
    public void levelPokemon(Pokemon player, Pokemon enemy){
        System.out.println("Select your Pokemon's level, between 1 and 100.");
        int levelSelecionado = ScannerAux.scanInt();
        while (levelSelecionado < 1 || levelSelecionado > 100) {
            System.out.println("The choosen level must be between 1 and 100, try again.");
            levelSelecionado = ScannerAux.scanInt();
        }
        player.changeLevel(levelSelecionado);

        System.out.println("Select your Pokemon's level, between 1 and 100.");
        levelSelecionado = ScannerAux.scanInt();
        while (levelSelecionado < 1 || levelSelecionado > 100) {
            System.out.println("The choosen level must be between 1 and 100, try again.");
            levelSelecionado = ScannerAux.scanInt();
        }
        enemy.changeLevel(levelSelecionado);
    }
}
