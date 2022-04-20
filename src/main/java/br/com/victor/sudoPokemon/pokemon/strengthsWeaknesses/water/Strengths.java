package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.water;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> water(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.WATER, Type.ICE, Type.STEEL));
    }

    public List<Type> waterFlying(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.WATER, Type.FIGHTING, Type.BUG, Type.ROCK, Type.DARK, Type.STEEL));
    }

    public List<Type> waterIce(){
        return new ArrayList<>(Arrays.asList(Type.WATER));
    }

    public List<Type> waterFighting(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.WATER, Type.ICE, Type.BUG, Type.ROCK, Type.DARK, Type.STEEL));
    }

    public List<Type> waterPoison(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.WATER, Type.ICE, Type.FIGHTING, Type.POISON, Type.BUG, Type.STEEL, Type.FAIRY));
    }

    public List<Type> waterPsychic(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.WATER, Type.ICE, Type.FIGHTING, Type.PSYCHIC, Type.STEEL));
    }
}
