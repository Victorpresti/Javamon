package br.com.victor.sudoPokemon.strengthsWeaknesses.rock;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> rock(){
        return new ArrayList<Type>(Arrays.asList(Type.WATER, Type.GRASS, Type.FIGHTING, Type.GROUND));
    }

    public List<Type> rockWater(){
        return new ArrayList<Type>(Arrays.asList(Type.ELECTRIC, Type.FIGHTING, Type.GROUND));
    }

    public List<Type> rockGround(){
        return new ArrayList<Type>(Arrays.asList(Type.ICE, Type.FIGHTING, Type.GROUND, Type.STEEL));
    }

    public List<Type> rockFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.WATER, Type.ELECTRIC, Type.ICE, Type.ROCK, Type.STEEL));
    }

}
