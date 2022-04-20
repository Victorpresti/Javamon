package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.poison;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strengths {

    public List<Type> poison(){
        return new ArrayList<>(Arrays.asList(Type.GRASS, Type.FIGHTING, Type.POISON, Type.BUG, Type.FAIRY));
    }

    public List<Type> poisonGround(){
        return new ArrayList<>(Arrays.asList(Type.FIGHTING, Type.BUG, Type.ROCK, Type.FAIRY));
    }

    public List<Type> poisonFlying(){
        return new ArrayList<>(Arrays.asList(Type.POISON, Type.FAIRY));
    }
}
