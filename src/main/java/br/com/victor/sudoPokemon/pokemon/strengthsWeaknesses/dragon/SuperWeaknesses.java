package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.dragon;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperWeaknesses {

    public List<Type> dragon(){
        return new ArrayList<Type>();
    }

    public List<Type> dragonFlying(){
        return new ArrayList<Type>(Arrays.asList(Type.ICE));
    }
}
