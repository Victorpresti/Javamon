package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.dragon;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> dragon(){
        return new ArrayList<>();
    }

    public List<Type> dragonFlying(){
        return new ArrayList<>(Arrays.asList(Type.GROUND));
    }
}
