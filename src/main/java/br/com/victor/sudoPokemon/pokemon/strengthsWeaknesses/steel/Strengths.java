package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.steel;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> steel(){
        return new ArrayList<Type>(Arrays.asList(Type.NORMAL, Type.GRASS, Type.ICE, Type.FLYING, Type.PSYCHIC, Type.BUG, Type.ROCK, Type.DRAGON, Type.STEEL, Type.FAIRY));
    }
}
