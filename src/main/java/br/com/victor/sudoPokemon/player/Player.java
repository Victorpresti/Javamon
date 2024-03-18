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
    private boolean defeated;
    private Pokemon currentPokemon;

    public void addPokemon(Pokemon pkmn){
        tm.add(pkmn, this.team);
    }

    public void removePokemon(Pokemon pkmn){
        tm.remove(pkmn, this.team);
    }

    public boolean isDefeated() {
        return !team.stream().anyMatch(pokemon -> pokemon.getCurrentStats().getHitpoints() > 0);
    }

    public Pokemon getCurrentPokemon() {
        return team.get(0);
    }
}
