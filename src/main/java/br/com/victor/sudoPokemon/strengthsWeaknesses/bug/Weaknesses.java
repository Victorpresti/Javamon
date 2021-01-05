package br.com.victor.sudoPokemon.strengthsWeaknesses.bug;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> bug(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.FLYING, Type.ROCK));
    }

    public List<Type> bugGrass(){
        return new ArrayList<Type>(Arrays.asList(Type.ICE, Type.POISON, Type.BUG, Type.ROCK));
    }

    public List<Type> bugPoison(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.FLYING, Type.PSYCHIC, Type.ROCK));
    }

    public List<Type> bugFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.ELECTRIC, Type.FLYING));
    }
}
