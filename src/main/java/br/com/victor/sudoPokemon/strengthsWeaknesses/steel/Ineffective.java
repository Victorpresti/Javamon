package br.com.victor.sudoPokemon.strengthsWeaknesses.steel;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> steel(){
        return new ArrayList<Type>(Arrays.asList(Type.POISON));
    }
}
