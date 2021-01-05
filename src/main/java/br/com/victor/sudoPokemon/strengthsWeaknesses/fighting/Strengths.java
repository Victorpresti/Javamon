package br.com.victor.sudoPokemon.strengthsWeaknesses.fighting;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> fighting(){
        return new ArrayList<Type>(Arrays.asList(Type.BUG, Type.ROCK, Type.DARK));
    }
}
