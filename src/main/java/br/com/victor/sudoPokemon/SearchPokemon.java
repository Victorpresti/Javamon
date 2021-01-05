package br.com.victor.sudoPokemon;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class SearchPokemon {

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
        return searchForName(pokemons, nomePokemon);
    }

}
