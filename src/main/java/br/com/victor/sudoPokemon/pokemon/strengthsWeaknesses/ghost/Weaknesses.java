package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ghost;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> ghost(){
        return new ArrayList<>(Arrays.asList(Type.GHOST, Type.DARK));
    }

    public List<Type> ghostPoison(){
        return new ArrayList<>(Arrays.asList(Type.GROUND, Type.PSYCHIC, Type.GHOST, Type.DARK));
    }
}
