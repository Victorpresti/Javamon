package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ice;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> ice(){
        return new ArrayList<>(Arrays.asList(Type.ICE));
    }

    public List<Type> iceFlying(){
        return new ArrayList<>(Arrays.asList(Type.GRASS, Type.BUG));
    }

    public List<Type> icePsychic(){
        return new ArrayList<>(Arrays.asList(Type.ICE, Type.PSYCHIC));
    }
}
