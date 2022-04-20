package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.grass;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperWeaknesses {

    public List<Type> grass(){
        return new ArrayList<>();
    }

    public List<Type> grassPoison(){
        return new ArrayList<>(Arrays.asList(Type.GRASS));
    }

    public List<Type> grassPsychic(){
        return new ArrayList<>(Arrays.asList(Type.BUG));
    }
}
