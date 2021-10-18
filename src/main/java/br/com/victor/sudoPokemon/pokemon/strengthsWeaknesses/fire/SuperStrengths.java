package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.fire;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SuperStrengths {

    public List<Type> fire(){
        return new ArrayList<Type>();
    }

    public List<Type> fireFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS, Type.BUG));
    }
}
