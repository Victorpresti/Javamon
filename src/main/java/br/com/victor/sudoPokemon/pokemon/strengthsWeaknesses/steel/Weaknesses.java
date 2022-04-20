package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.steel;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> steel(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.FIGHTING, Type.GROUND));
    }
}
