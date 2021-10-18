package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ice;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperWeaknesses {

    public List<Type> ice(){
        return new ArrayList<Type>();
    }

    public List<Type> iceFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.ROCK));
    }

    public List<Type> icePsychic(){
        return new ArrayList<Type>();
    }
}