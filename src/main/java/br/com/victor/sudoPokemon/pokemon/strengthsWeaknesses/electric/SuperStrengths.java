package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.electric;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStrengths {

    public List<Type> electric(){
        return new ArrayList<>();
    }

    public List<Type> electricFlying(){
        return new ArrayList<>();
    }

    public List<Type> electricSteel(){
        return new ArrayList<>(Arrays.asList(Type.FLYING, Type.STEEL));
    }
}
