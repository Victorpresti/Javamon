package br.com.victor.sudoPokemon.strengthsWeaknesses.rock;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> rock(){
        return new ArrayList<Type>(Arrays.asList(Type.NORMAL, Type.FIRE, Type.POISON, Type.FLYING));
    }

    public List<Type> rockWater(){
        return new ArrayList<Type>(Arrays.asList(Type.NORMAL, Type.ICE, Type.POISON, Type.FLYING, Type.BUG));
    }

    public List<Type> rockGround(){
        return new ArrayList<Type>(Arrays.asList(Type.NORMAL, Type.FIRE, Type.FLYING, Type.ROCK));
    }

    public List<Type> rockFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.NORMAL, Type.FIRE, Type.POISON, Type.FLYING, Type.BUG));
    }
}
