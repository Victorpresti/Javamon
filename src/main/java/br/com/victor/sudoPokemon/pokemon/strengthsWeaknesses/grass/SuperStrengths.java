package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.grass;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStrengths {

    public List<Type> grass(){
        return new ArrayList<Type>();
    }

    public List<Type> grassPoison(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS));
    }

    public List<Type> grassPsychic(){
        return new ArrayList<Type>();
    }
}
