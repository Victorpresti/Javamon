package br.com.victor.sudoPokemon.strengthsWeaknesses.ground;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> ground(){
        return new ArrayList<Type>(Arrays.asList(Type.POISON, Type.ROCK));
    }
}
