package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.fairy;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> fairy(){
        return new ArrayList<>(Arrays.asList(Type.POISON, Type.STEEL));
    }
}
