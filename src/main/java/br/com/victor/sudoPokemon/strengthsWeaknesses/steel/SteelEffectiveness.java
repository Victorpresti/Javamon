package br.com.victor.sudoPokemon.strengthsWeaknesses.steel;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class SteelEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> steel(){
        compiledEffectiveness.add(strengths.steel());
        compiledEffectiveness.add(superStrengths.steel());
        compiledEffectiveness.add(weaknesses.steel());
        compiledEffectiveness.add(superWeaknesses.steel());
        compiledEffectiveness.add(ineffective.steel());
        return compiledEffectiveness;
    }

}
