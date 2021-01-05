package br.com.victor.sudoPokemon.strengthsWeaknesses.fire;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> fire(){
        return new ArrayList<Type>(Arrays.asList(Type.WATER, Type.GROUND, Type.ROCK));
    }

    public List<Type> fireFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.WATER, Type.ELECTRIC));
    }
}
