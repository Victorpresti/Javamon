package br.com.victor.sudoPokemon.strengthsWeaknesses.rock;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStrengths {

    public List<Type> rock(){
        return new ArrayList<Type>();
    }

    public List<Type> rockWater(){
        return new ArrayList<Type>(Arrays.asList(Type.FIRE));
    }

    public List<Type> rockGround(){
        return new ArrayList<Type>(Arrays.asList(Type.POISON));
    }

    public List<Type> rockFlying(){
        return new ArrayList<Type>();
    }
}
