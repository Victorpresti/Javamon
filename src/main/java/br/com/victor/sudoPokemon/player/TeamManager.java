package br.com.victor.sudoPokemon.player;

import br.com.victor.sudoPokemon.pokemon.Pokemon;

import java.util.List;

public class TeamManager {

    public void add(Pokemon pkmn, List<Pokemon> team){
        if (team.size() <= 5) team.add(pkmn);
        else System.out.println("Your team can't contain more than 6 Pokemon");
    }

    public void remove(Pokemon pkmn, List<Pokemon> team){
        if (team.size() > 1) team.remove(pkmn);
        else System.out.println("You need to carry at least one Pokemon");
    }
}
