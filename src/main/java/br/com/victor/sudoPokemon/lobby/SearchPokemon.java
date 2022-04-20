package br.com.victor.sudoPokemon.lobby;

import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.pokemon.PokemonGenerator;
import br.com.victor.sudoPokemon.utils.ScannerAux;

import java.util.List;
import java.util.Optional;

public class SearchPokemon {

    final PokemonGenerator pg = new PokemonGenerator();
    final List<List<Pokemon>> pokemonList = pg.generatePokemon(1);
    final List<Pokemon> genOne = pokemonList.get(0);

    public Pokemon pokemonSearch(){
        System.out.println();
        System.out.println("Choose your Pokemon by name, type help if you need assistance.");
        String pokemonSelecionado = ScannerAux.scanText();

        //devCheat
        if (pokemonSelecionado.equals("quick")){
            return searchForName(genOne, "Charizard").get();
        }

        while (pokemonSelecionado.equals("help")) {
            pokemonList(pokemonList);
            System.out.println("Choose your Pokemon by name, type help if you need assistance.");
            pokemonSelecionado = ScannerAux.scanText();
        }
        return searchForName(pokemonList.get(0), pokemonSelecionado).get();
    }

    public Optional<Pokemon> searchForName(List<Pokemon> pokemons, String nomePokemon){

        Optional<Pokemon> optional = pokemons.stream()
                .filter(p -> p.getName().equalsIgnoreCase(nomePokemon))
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
