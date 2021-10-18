package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.electric;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperWeaknesses {

    public List<Type> electric(){
        return new ArrayList<Type>();
    }

    public List<Type> electricFlying(){
        return new ArrayList<Type>();
    }

    public List<Type> electricSteel(){
        return new ArrayList<Type>(Arrays.asList(Type.GROUND));
    }
}
