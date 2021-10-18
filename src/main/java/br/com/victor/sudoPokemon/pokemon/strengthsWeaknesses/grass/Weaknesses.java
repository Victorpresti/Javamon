package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.grass;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> grass(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.ICE, Type.POISON, Type.FLYING, Type.BUG));
    }

    public List<Type> grassPoison(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.ICE, Type.FLYING, Type.PSYCHIC));
    }

    public List<Type> grassPsychic(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.ICE, Type.POISON, Type.FLYING, Type.GHOST, Type.DARK));
    }
}
