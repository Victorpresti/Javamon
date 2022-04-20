package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.normal;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> normal(){
        return new ArrayList<>();
    }

    public List<Type> normalFairy(){
        return new ArrayList<>(Arrays.asList(Type.BUG, Type.DARK));
    }
}
