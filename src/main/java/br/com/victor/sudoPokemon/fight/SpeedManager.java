package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.pokemon.Pokemon;

import java.util.LinkedHashMap;

public class SpeedManager {

    final LinkedHashMap<String, Pokemon> speedResult = new LinkedHashMap<>();

    public LinkedHashMap<String, Pokemon> checkSpeed(Pokemon p1, Pokemon p2) {
        if (p1.getCurrentStats().getSpeed() == p2.getCurrentStats().getSpeed()) return speedTie(p1, p2);
        else return speedCheck(p1, p2);
    }

    private LinkedHashMap<String, Pokemon> speedTie(Pokemon p1, Pokemon p2) {
        if (Math.round(((Math.random() * (100 - 1)) + 1) * 100.0) / 100.0 >= 50.0) {
            speedResult.put("Player", p1);
            speedResult.put("Enemy", p2);
            return speedResult;
        } else {
            speedResult.put("Enemy", p1);
            speedResult.put("Player", p2);
            return speedResult;
        }
    }

    private LinkedHashMap<String, Pokemon> speedCheck(Pokemon p1, Pokemon p2) {
        if (p1.getCurrentStats().getSpeed() > p2.getCurrentStats().getSpeed()){
            speedResult.put("Player", p1);
            speedResult.put("Enemy", p2);
            return speedResult;
        } else {
            speedResult.put("Enemy", p1);
            speedResult.put("Player", p2);
            return speedResult;
        }
    }
}


