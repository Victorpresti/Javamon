package br.com.victor.sudoPokemon.strengthsWeaknesses.normal;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> normal(){
        return new ArrayList<Type>();
    }

    public List<Type> normalFairy(){
        return new ArrayList<Type>(Arrays.asList(Type.BUG, Type.DARK));
    }
}
