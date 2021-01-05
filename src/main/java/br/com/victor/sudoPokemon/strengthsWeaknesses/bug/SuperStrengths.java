package br.com.victor.sudoPokemon.strengthsWeaknesses.bug;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStrengths {

    public List<Type> bug(){
        return new ArrayList<Type>();
    }

    public List<Type> bugGrass(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS, Type.GROUND));
    }

    public List<Type> bugPoison(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS, Type.FIGHTING));
    }

    public List<Type> bugFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS, Type.FIGHTING));
    }
}
