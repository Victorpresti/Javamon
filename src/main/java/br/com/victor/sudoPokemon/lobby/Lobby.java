package br.com.victor.sudoPokemon.lobby;

import br.com.victor.sudoPokemon.pokemon.Moves;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.pokemon.PokemonGenerator;
import br.com.victor.sudoPokemon.pokemon.SearchPokemon;
import br.com.victor.sudoPokemon.fight.Battle;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lobby {

    Scanner sc = new Scanner(System.in);
    PokemonGenerator pg = new PokemonGenerator();
    SearchPokemon sp = new SearchPokemon();
    Battle bt = new Battle();
    List<List<Pokemon>> listaPokemons = pg.generatePokemon(1);
    List<Pokemon> GenOne = listaPokemons.get(0);

    public void lobby() {

        System.out.println("----------------------------------------------");
        System.out.println("-----------------   LOBBY   ------------------");
        System.out.println("----------------------------------------------");

        //Build your team
        //new BuildTeam().teamBuilder(sc);

        //Choosing your Pokemon
        System.out.println("Digite o nome do seu pokemon, digite help para obter a lista de pokemons disponíveis");
        String pokemonSelecionado = sc.next();

        //devCheat
        if (pokemonSelecionado.equals("quick")){
            quickStartup();
        }


        while (pokemonSelecionado.equals("help")) {
            listaPokemon(listaPokemons);
            System.out.println("Digite o nome do seu pokemon, digite help para obter a lista de pokemons disponíveis");
            pokemonSelecionado = sc.next();
        }
        Pokemon player = sp.searchForName(GenOne, pokemonSelecionado).get();

        //Escolher o pokemon do adversário
        System.out.println("Digite o nome do pokemon do seu oponente, digite help para obter a lista de pokemons disponíveis");
        pokemonSelecionado = sc.next();
        while (pokemonSelecionado.equals("help")) {
            listaPokemon(listaPokemons);
            System.out.println("Digite o nome do pokemon do seu oponente, digite help para obter a lista de pokemons disponíveis");
            pokemonSelecionado = sc.next();
        }
        Pokemon enemy = sp.searchForName(GenOne, pokemonSelecionado).get();

        //Level
        levelPokemon(player, enemy);

        player.addMoves(Moves.BLIZZARD);
        player.addMoves(Moves.FIRE_BLAST);
        player.addMoves(Moves.THUNDER);
        player.addMoves(Moves.HYDRO_PUMP);
        enemy.addMoves(Arrays.asList(Moves.FIRE_BLAST, Moves.BLIZZARD, Moves.THUNDER, Moves.HYDRO_PUMP));

        bt.pokemonBattle(player, enemy);


    }

    public void listaPokemon(List<List<Pokemon>> listaPokemons) {
        System.out.println("------ Geração 1 ------");
        GenOne.forEach(p -> System.out.println(p.getName()));
    }

    public void levelPokemon(Pokemon player, Pokemon enemy){
        System.out.println("Selecione o level do seu pokemon, entre 1 e 100");
        int levelSelecionado = sc.nextInt();
        while (levelSelecionado < 1 || levelSelecionado > 100) {
            System.out.println("O level do seu pokemon deve ser entre 1 e 100, tente novamente");
            levelSelecionado = sc.nextInt();
        }
        player.changeLevel(levelSelecionado);

        System.out.println("Selecione o level do pokemon do seu oponente, entre 1 e 100");
        levelSelecionado = sc.nextInt();
        while (levelSelecionado < 1 || levelSelecionado > 100) {
            System.out.println("O level do seu pokemon deve ser entre 1 e 100, tente novamente");
            levelSelecionado = sc.nextInt();
        }
        enemy.changeLevel(levelSelecionado);
    }

    private void quickStartup(){

        Pokemon player = sp.searchForName(GenOne, "Charizard").get();
        Pokemon enemy = sp.searchForName(GenOne,  "Venusaur").get();

        Pokemon p1 = player.clone(player);
        Pokemon e1 = enemy.clone(enemy);


        p1.addMoves(Arrays.asList(Moves.FIRE_BLAST, Moves.BLIZZARD, Moves.THUNDER, Moves.HYDRO_PUMP));
        e1.addMoves(Arrays.asList(Moves.FIRE_BLAST, Moves.BLIZZARD, Moves.THUNDER, Moves.HYDRO_PUMP));

        p1.changeLevel(50);
        e1.changeLevel(50);


        bt.pokemonBattle(p1, e1);
    }
}
