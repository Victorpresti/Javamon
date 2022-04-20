package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ghost;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> ghost(){
        return new ArrayList<>(Arrays.asList(Type.NORMAL, Type.FIGHTING));
    }

    public List<Type> ghostPoison(){
        return new ArrayList<>(Arrays.asList(Type.NORMAL, Type.FIGHTING));
    }
}
