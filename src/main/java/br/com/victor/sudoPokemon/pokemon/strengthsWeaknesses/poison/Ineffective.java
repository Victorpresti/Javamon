package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.poison;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> poison(){
        return new ArrayList<>();
    }

    public List<Type> poisonGround(){
        return new ArrayList<>(Arrays.asList(Type.ELECTRIC));
    }

    public List<Type> poisonFlying(){
        return new ArrayList<>(Arrays.asList(Type.GROUND));
    }
}
