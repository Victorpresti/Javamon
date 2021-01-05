package br.com.victor.sudoPokemon.strengthsWeaknesses.psychic;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStrengths {

    public List<Type> psychic(){
        return new ArrayList<Type>();
    }

    public List<Type> psychicFairy(){
        return new ArrayList<Type>(Arrays.asList(Type.FIGHTING));
    }
}
