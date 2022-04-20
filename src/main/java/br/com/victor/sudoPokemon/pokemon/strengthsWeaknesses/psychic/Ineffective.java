package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.psychic;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {
    public List<Type> psychic(){
        return new ArrayList<>();
    }

    public List<Type> psychicFairy(){
        return new ArrayList<>(Arrays.asList(Type.DRAGON));
    }
}
