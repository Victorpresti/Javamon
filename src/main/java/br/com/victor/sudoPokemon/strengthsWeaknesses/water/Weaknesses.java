package br.com.victor.sudoPokemon.strengthsWeaknesses.water;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> water(){
        return new ArrayList<Type>(Arrays.asList(Type.ELECTRIC, Type.GRASS));
    }

    public List<Type> waterFighting(){
        return new ArrayList<Type>(Arrays.asList(Type.ELECTRIC, Type.GRASS, Type.FLYING, Type.PSYCHIC, Type.FAIRY));
    }

    public List<Type> waterFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.ROCK));
    }

    public List<Type> waterIce(){
        return new ArrayList<Type>(Arrays.asList(Type.ELECTRIC, Type.GRASS, Type.FIGHTING, Type.ROCK));
    }


    public List<Type> waterPoison(){
        return new ArrayList<Type>(Arrays.asList(Type.ELECTRIC, Type.GROUND, Type.PSYCHIC));
    }

    public List<Type> waterPsychic(){
        return new ArrayList<Type>(Arrays.asList(Type.ELECTRIC, Type.GRASS, Type.BUG, Type.GHOST, Type.DARK));
    }
}
