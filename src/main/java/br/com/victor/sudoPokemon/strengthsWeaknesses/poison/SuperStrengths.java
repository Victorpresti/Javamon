package br.com.victor.sudoPokemon.strengthsWeaknesses.poison;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStrengths {

    public List<Type> poison(){
        return new ArrayList<Type>();
    }

    public List<Type> poisonGround(){
        return new ArrayList<Type>(Arrays.asList(Type.POISON));
    }

    public List<Type> poisonFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.GRASS, Type.FIGHTING, Type.BUG));
    }
}
