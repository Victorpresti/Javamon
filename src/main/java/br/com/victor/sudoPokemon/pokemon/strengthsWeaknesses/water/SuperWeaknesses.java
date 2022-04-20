package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.water;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperWeaknesses {

    public List<Type> water(){
        return new ArrayList<>();
    }

    public List<Type> waterFlying(){
        return new ArrayList<>(Arrays.asList(Type.ELECTRIC));
    }

    public List<Type> waterIce(){
        return new ArrayList<>();
    }

    public List<Type> waterFighting(){
        return new ArrayList<>();
    }

    public List<Type> waterPoison(){
        return new ArrayList<>();
    }

    public List<Type> waterPsychic(){
        return new ArrayList<>();
    }
}
