package br.com.victor.sudoPokemon.strengthsWeaknesses.electric;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStrengths {

    public List<Type> electric(){
        return new ArrayList<Type>();
    }

    public List<Type> electricFlying(){
        return new ArrayList<Type>();
    }

    public List<Type> electricSteel(){
        return new ArrayList<Type>(Arrays.asList(Type.FLYING, Type.STEEL));
    }
}
