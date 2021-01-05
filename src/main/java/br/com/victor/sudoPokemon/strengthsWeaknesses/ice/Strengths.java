package br.com.victor.sudoPokemon.strengthsWeaknesses.ice;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> ice(){
        return new ArrayList<Type>(Arrays.asList(Type.ICE));
    }

    public List<Type> iceFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS, Type.BUG));
    }

    public List<Type> icePsychic(){
        return new ArrayList<Type>(Arrays.asList(Type.ICE, Type.PSYCHIC));
    }
}
