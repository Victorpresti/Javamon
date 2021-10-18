package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.dark;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> dark(){
        return new ArrayList<Type>(Arrays.asList(Type.GHOST, Type.DARK));
    }
}
