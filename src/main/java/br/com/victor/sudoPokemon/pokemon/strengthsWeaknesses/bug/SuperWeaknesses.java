package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.bug;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperWeaknesses {

    public List<Type> bug(){
        return new ArrayList<>();
    }

    public List<Type> bugGrass(){
        return new ArrayList<>(Arrays.asList(Type.FIRE, Type.FLYING));
    }

    public List<Type> bugPoison(){
        return new ArrayList<>();
    }

    public List<Type> bugFlying(){
        return new ArrayList<>(Arrays.asList(Type.ROCK));
    }
}
