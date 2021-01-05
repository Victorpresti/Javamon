package br.com.victor.sudoPokemon.strengthsWeaknesses.fairy;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weaknesses {

    public List<Type> fairy(){
        return new ArrayList<Type>(Arrays.asList(Type.POISON, Type.STEEL));
    }
}
