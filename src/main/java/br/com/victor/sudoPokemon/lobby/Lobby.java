package br.com.victor.sudoPokemon.lobby;

import br.com.victor.sudoPokemon.utils.ScannerAux;
import br.com.victor.sudoPokemon.pokemon.Moves;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.fight.Battle;

import java.util.Arrays;

public class Lobby {

    SearchPokemon sp = new SearchPokemon();
    Battle bt = new Battle();

    public void lobby() {

        System.out.println("----------------------------------------------");
        System.out.println("-----------------   LOBBY   ------------------");
        System.out.println("----------------------------------------------");

        //Build your team
        //new BuildTeam().teamBuilder();

        //Choosing your Pokemon
        Pokemon a1 = sp.pokemonSearch();
        Pokemon a1c = a1.clone(a1);

        //Opponent Pokemon
        Pokemon b1 = sp.pokemonSearch();
        Pokemon b1c = b1.clone(b1);

        a1c.changeLevel(50);
        b1c.changeLevel(50);

        a1c.addMoves(Arrays.asList(Moves.FIRE_BLAST, Moves.BLIZZARD, Moves.THUNDER, Moves.HYDRO_PUMP));
        b1c.addMoves(Arrays.asList(Moves.FIRE_BLAST, Moves.BLIZZARD, Moves.THUNDER, Moves.HYDRO_PUMP));

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
