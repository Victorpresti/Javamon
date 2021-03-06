package br.com.victor.sudoPokemon.strengthsWeaknesses.poison;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> poison(){
        return new ArrayList<Type>();
    }

    public List<Type> poisonGround(){
        return new ArrayList<Type>(Arrays.asList(Type.ELECTRIC));
    }

    public List<Type> poisonFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.GROUND));
    }
}
