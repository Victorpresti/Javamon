package br.com.victor.sudoPokemon.lobby;

import java.util.Scanner;

public class BuildTeam {

    public void teamBuilder(Scanner sc){

       choosePokemon(numberOfPokemons(sc));
    }

    private int numberOfPokemons(Scanner sc){
        System.out.println("Digite quantos pokemons você quer adicionar ao seu time, máximo 6");
        int numberOfPokemon = sc.nextInt();

        while(numberOfPokemon <= 0 || numberOfPokemon > 6){
            System.out.println("Seu time deve conter pelo menos 1 pokemon e no máximo 6");
            numberOfPokemon = sc.nextInt();
        }

        return numberOfPokemon;
    }

    private void choosePokemon(int numberOfPokemon){
        for (int i = 0; i < numberOfPokemon; i++) {

        }
    }
}
