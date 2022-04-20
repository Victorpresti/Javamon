package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ground;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> ground(){
        return new ArrayList<>(Arrays.asList(Type.WATER, Type.GRASS, Type.ICE));
    }
}
