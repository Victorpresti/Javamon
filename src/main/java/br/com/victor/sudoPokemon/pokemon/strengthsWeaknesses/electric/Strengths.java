package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.electric;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> electric(){
        return new ArrayList<>(Arrays.asList(Type.ELECTRIC, Type.FLYING, Type.STEEL));
    }

    public List<Type> electricFlying(){
        return new ArrayList<>(Arrays.asList(Type.GRASS, Type.FIGHTING, Type.FLYING, Type.BUG, Type.STEEL));
    }

    public List<Type> electricSteel(){
        return new ArrayList<>(Arrays.asList(Type.NORMAL, Type.ELECTRIC, Type.GRASS, Type.ICE, Type.PSYCHIC, Type.BUG, Type.ROCK, Type.DRAGON, Type.FAIRY));
    }
}
