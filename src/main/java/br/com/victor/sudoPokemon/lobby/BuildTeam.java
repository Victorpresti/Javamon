package br.com.victor.sudoPokemon.lobby;

import br.com.victor.sudoPokemon.utils.ScannerAux;

public class BuildTeam {

    public void teamBuilder(){

       choosePokemon(numberOfPokemons());
    }

    private int numberOfPokemons(){
        System.out.println("Digite quantos pokemons você quer adicionar ao seu time, máximo 6");
        int numberOfPokemon = ScannerAux.scanInt();

        while(numberOfPokemon <= 0 || numberOfPokemon > 6){
            System.out.println("Your team must contain at least 1 pokemon");
            numberOfPokemon = ScannerAux.scanInt();
        }

        return numberOfPokemon;
    }

    private void choosePokemon(int numberOfPokemon){
        for (int i = 0; i < numberOfPokemon; i++) {
        }
    }
}
