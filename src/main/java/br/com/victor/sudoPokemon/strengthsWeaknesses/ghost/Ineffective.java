package br.com.victor.sudoPokemon.strengthsWeaknesses.ghost;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ineffective {

    public List<Type> ghost(){
        return new ArrayList<Type>(Arrays.asList(Type.NORMAL, Type.FIGHTING));
    }

    public List<Type> ghostPoison(){
        return new ArrayList<Type>(Arrays.asList(Type.NORMAL, Type.FIGHTING));
    }
}
