package br.com.victor.sudoPokemon.strengthsWeaknesses.fighting;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> fighting(){
        return new ArrayList<Type>(Arrays.asList(Type.FLYING, Type.PSYCHIC, Type.FAIRY));
    }
}
