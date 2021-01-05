package br.com.victor.sudoPokemon.strengthsWeaknesses.grass;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperWeaknesses {

    public List<Type> grass(){
        return new ArrayList<Type>();
    }

    public List<Type> grassPoison(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS));
    }

    public List<Type> grassPsychic(){
        return new ArrayList<Type>(Arrays.asList(Type.BUG));
    }
}
