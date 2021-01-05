package br.com.victor.sudoPokemon.strengthsWeaknesses.dragon;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> dragon(){
        return new ArrayList<Type>();
    }

    public List<Type> dragonFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.GROUND));
    }
}
