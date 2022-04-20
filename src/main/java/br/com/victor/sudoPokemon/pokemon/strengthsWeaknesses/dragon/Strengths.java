package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.dragon;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> dragon(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.WATER, Type.GRASS, Type.ELECTRIC));
    }

    public List<Type> dragonFlying(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.WATER, Type.FIGHTING, Type.BUG));
    }
}
