package br.com.victor.sudoPokemon.strengthsWeaknesses.ground;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> ground(){
        return new ArrayList<Type>(Arrays.asList(Type.WATER, Type.GRASS, Type.ICE));
    }
}
