package br.com.victor.sudoPokemon.strengthsWeaknesses.flying;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> flying(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS, Type.FIGHTING, Type.BUG));
    }

    public List<Type> flyingNormal(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS, Type.BUG));
    }
}
