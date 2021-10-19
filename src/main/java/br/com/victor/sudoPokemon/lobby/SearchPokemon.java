package br.com.victor.sudoPokemon.lobby;

import br.com.victor.sudoPokemon.utils.ScannerAux;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.pokemon.PokemonGenerator;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class SearchPokemon {

    PokemonGenerator pg = new PokemonGenerator();
    List<List<Pokemon>> pokemonList = pg.generatePokemon(1);
    List<Pokemon> genOne = pokemonList.get(0);

    public Pokemon pokemonSearch(){
        System.out.println();
        System.out.println("Digite o nome do seu pokemon, digite help para obter a lista de pokemons disponíveis");
        String pokemonSelecionado = ScannerAux.scanText();

        //devCheat
        if (pokemonSelecionado.equals("quick")){
            return searchForName(genOne, "Charizard").get();
        }

        while (pokemonSelecionado.equals("help")) {
            pokemonList(pokemonList);
            System.out.println("Digite o nome do seu pokemon, digite help para obter a lista de pokemons disponíveis");
            pokemonSelecionado = ScannerAux.scanText();
        }
        return searchForName(pokemonList.get(0), pokemonSelecionado).get();

    }

    public Optional<Pokemon> searchForName(List<Pokemon> pokemons){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do seu Pokemon! ");
        String nomePokemon = sc.next();

        Optional<Pokemon> optional = pokemons.stream()
                .filter(p -> p.getName().toLowerCase().equals(nomePokemon.toLowerCase()))
                .findFirst();

        if(optional.isPresent()){
            System.out.println(nomePokemon + " encontrado");
            return optional;
        }
        System.out.println(nomePokemon + " não encontrado, por favor tente novamente ");
        return searchForName(pokemons);
    }

    public Optional<Pokemon> searchForName(List<Pokemon> pokemons, String nomePokemon){

        Optional<Pokemon> optional = pokemons.stream()
                .filter(p -> p.getName().toLowerCase().equals(nomePokemon.toLowerCase()))
                .findFirst();

        if(optional.isPresent()){
            System.out.println(nomePokemon + " encontrado");
            return optional;
        }
        System.out.println(nomePokemon + " não encontrado, por favor tente novamente ");
        return searchForName(pokemons, ScannerAux.scanText());
    }

    private void pokemonList(List<List<Pokemon>> listaPokemons) {
        System.out.println("------ Geração 1 ------");
        listaPokemons.get(0).forEach(p -> System.out.println(p.getName()));
    }

}
