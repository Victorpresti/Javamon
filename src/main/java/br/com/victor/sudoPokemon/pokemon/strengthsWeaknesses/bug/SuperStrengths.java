package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.bug;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStrengths {

    public List<Type> bug(){
        return new ArrayList<>();
    }

    public List<Type> bugGrass(){
        return new ArrayList<>(Arrays.asList(Type.GRASS, Type.GROUND));
    }

    public List<Type> bugPoison(){
        return new ArrayList<>(Arrays.asList(Type.GRASS, Type.FIGHTING));
    }

    public List<Type> bugFlying(){
        return new ArrayList<>(Arrays.asList(Type.GRASS, Type.FIGHTING));
    }
}
