package br.com.victor.sudoPokemon.strengthsWeaknesses.poison;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> poison(){
        return new ArrayList<Type>(Arrays.asList(Type.GROUND, Type.PSYCHIC));
    }

    public List<Type> poisonGround(){
        return new ArrayList<Type>(Arrays.asList(Type.WATER, Type.ICE, Type.GROUND, Type.PSYCHIC));
    }

    public List<Type> poisonFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.ELECTRIC, Type.ICE, Type.PSYCHIC, Type.ROCK));
    }
}
