package br.com.victor.sudoPokemon.strengthsWeaknesses.ice;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> ice(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.FIGHTING, Type.ROCK, Type.STEEL));
    }

    public List<Type> iceFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.ELECTRIC, Type.STEEL));
    }

    public List<Type> icePsychic(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.BUG, Type.ROCK, Type.GHOST, Type.DARK, Type.STEEL));
    }
}
