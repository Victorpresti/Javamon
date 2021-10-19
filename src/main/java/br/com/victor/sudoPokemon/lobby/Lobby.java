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
        //new BuildTeam().teamBuilder(sc);

        //Choosing your Pokemon
        Pokemon a1 = sp.pokemonSearch();
        Pokemon a1c = a1.clone(a1);

        //Opponent Pokemon
        Pokemon b1 = sp.pokemonSearch();
        Pokemon b1c = b1.clone(b1);

        //Level
        //levelPokemon(a1, b1);
        //Quick startup
        a1c.changeLevel(50);
        b1c.changeLevel(50);


        a1c.addMoves(Arrays.asList(Moves.FIRE_BLAST, Moves.BLIZZARD, Moves.THUNDER, Moves.HYDRO_PUMP));
        b1c.addMoves(Arrays.asList(Moves.FIRE_BLAST, Moves.BLIZZARD, Moves.THUNDER, Moves.HYDRO_PUMP));

        bt.pokemonBattle(a1c, b1c);

    }



    public void levelPokemon(Pokemon player, Pokemon enemy){
        System.out.println("Selecione o level do seu pokemon, entre 1 e 100");
        int levelSelecionado = ScannerAux.scanInt();
        while (levelSelecionado < 1 || levelSelecionado > 100) {
            System.out.println("O level do seu pokemon deve ser entre 1 e 100, tente novamente");
            levelSelecionado = ScannerAux.scanInt();
        }
        player.changeLevel(levelSelecionado);

        System.out.println("Selecione o level do pokemon do seu oponente, entre 1 e 100");
        levelSelecionado = ScannerAux.scanInt();
        while (levelSelecionado < 1 || levelSelecionado > 100) {
            System.out.println("O level do seu pokemon deve ser entre 1 e 100, tente novamente");
            levelSelecionado = ScannerAux.scanInt();
        }
        enemy.changeLevel(levelSelecionado);
    }
}
