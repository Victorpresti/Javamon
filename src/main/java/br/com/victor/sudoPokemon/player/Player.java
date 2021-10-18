package br.com.victor.sudoPokemon.player;

import br.com.victor.sudoPokemon.pokemon.Pokemon;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Player {

    private String name;
    private List<Pokemon> team;
    private TeamManager tm;

    public Player(){}

    public Player(String name){
        this.name = name;
        this.team = new ArrayList<>();
    }

    public void addPokemon(Pokemon pkmn){
        tm.add(pkmn, this.team);
    }

    public void removePokemon(Pokemon pkmn){
        tm.remove(pkmn, this.team);
    }

}
