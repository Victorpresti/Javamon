package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.psychic;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> psychic(){
        return new ArrayList<Type>(Arrays.asList(Type.BUG, Type.GHOST, Type.DARK));
    }

    public List<Type> psychicFairy(){
        return new ArrayList<Type>(Arrays.asList(Type.POISON, Type.GHOST, Type.STEEL));
    }
}
