package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ice;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> ice(){
        return new ArrayList<>();
    }

    public List<Type> iceFlying(){
        return new ArrayList<>(Arrays.asList(Type.GROUND));
    }

    public List<Type> icePsychic(){
        return new ArrayList<>();
    }


}
