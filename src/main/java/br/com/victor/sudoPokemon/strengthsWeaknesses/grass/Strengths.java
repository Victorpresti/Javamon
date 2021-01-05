package br.com.victor.sudoPokemon.strengthsWeaknesses.grass;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> grass(){
        return new ArrayList<Type>(Arrays.asList(Type.WATER, Type.ELECTRIC, Type.GRASS, Type.GROUND));
    }

    public List<Type> grassPoison(){
        return new ArrayList<Type>(Arrays.asList(Type.WATER, Type.ELECTRIC, Type.FIGHTING, Type.FAIRY));
    }

    public List<Type> grassPsychic(){
        return new ArrayList<Type>(Arrays.asList(Type.WATER, Type.ELECTRIC, Type.GRASS, Type.FIGHTING, Type.GROUND, Type.PSYCHIC));
    }

}
