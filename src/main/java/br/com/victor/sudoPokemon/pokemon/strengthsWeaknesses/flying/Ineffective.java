package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.flying;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> flying(){
        return new ArrayList<Type>(Arrays.asList(Type.GROUND));
    }

    public List<Type> flyingNormal(){
        return new ArrayList<Type>(Arrays.asList(Type.GROUND, Type.GHOST));
    }
}
