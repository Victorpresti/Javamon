package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.rock;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStrengths {

    public List<Type> rock(){
        return new ArrayList<>();
    }

    public List<Type> rockWater(){
        return new ArrayList<>(Arrays.asList(Type.FIRE));
    }

    public List<Type> rockGround(){
        return new ArrayList<>(Arrays.asList(Type.POISON));
    }

    public List<Type> rockFlying(){
        return new ArrayList<>();
    }
}
