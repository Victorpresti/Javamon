package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.bug;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> bug(){
        return new ArrayList<>(Arrays.asList(Type.GRASS, Type.FIGHTING, Type.GROUND));
    }

    public List<Type> bugGrass(){
        return new ArrayList<>(Arrays.asList(Type.WATER, Type.ELECTRIC, Type.FIGHTING));
    }

    public List<Type> bugPoison(){
        return new ArrayList<>(Arrays.asList(Type.POISON, Type.BUG, Type.FAIRY));
    }

    public List<Type> bugFlying(){
        return new ArrayList<>(Arrays.asList(Type.BUG));
    }
}
