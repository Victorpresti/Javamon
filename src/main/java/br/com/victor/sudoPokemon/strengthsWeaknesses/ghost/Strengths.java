package br.com.victor.sudoPokemon.strengthsWeaknesses.ghost;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> ghost(){
        return new ArrayList<Type>(Arrays.asList(Type.POISON, Type.BUG));
    }

    public List<Type> ghostPoison(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS, Type.FAIRY));
    }

}
