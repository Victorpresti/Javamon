package br.com.victor.sudoPokemon.strengthsWeaknesses.water;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperWeaknesses {

    public List<Type> water(){
        return new ArrayList<Type>();
    }

    public List<Type> waterFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.ELECTRIC));
    }

    public List<Type> waterIce(){
        return new ArrayList<Type>();
    }

    public List<Type> waterFighting(){
        return new ArrayList<Type>();
    }

    public List<Type> waterPoison(){
        return new ArrayList<Type>();
    }

    public List<Type> waterPsychic(){
        return new ArrayList<Type>();
    }
}
