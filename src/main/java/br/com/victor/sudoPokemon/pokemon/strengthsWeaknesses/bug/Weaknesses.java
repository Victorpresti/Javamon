package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.bug;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> bug(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.FLYING, Type.ROCK));
    }

    public List<Type> bugGrass(){
        return new ArrayList<>(Arrays.asList(Type.ICE, Type.POISON, Type.BUG, Type.ROCK));
    }

    public List<Type> bugPoison(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.FLYING, Type.PSYCHIC, Type.ROCK));
    }

    public List<Type> bugFlying(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.ELECTRIC, Type.FLYING));
    }
}
