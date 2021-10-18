package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.water;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> water(){
        return new ArrayList<Type>();
    }

    public List<Type> waterIce(){
        return new ArrayList<Type>();
    }

    public List<Type> waterFighting(){
        return new ArrayList<Type>();
    }

    public List<Type> waterFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.FLYING));
    }

    public List<Type> waterPoison(){
        return new ArrayList<Type>();
    }

    public List<Type> waterPsychic(){
        return new ArrayList<Type>();
    }
}
