package br.com.victor.sudoPokemon.strengthsWeaknesses.fire;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Strengths {

    public List<Type> fire(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.GRASS, Type.ICE, Type.BUG, Type.STEEL, Type.FAIRY));
    }

    public List<Type> fireFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.FIGHTING, Type.BUG, Type.STEEL, Type.FAIRY));
    }
}
