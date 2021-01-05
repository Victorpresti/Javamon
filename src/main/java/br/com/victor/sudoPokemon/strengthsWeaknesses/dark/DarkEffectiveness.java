package br.com.victor.sudoPokemon.strengthsWeaknesses.dark;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class DarkEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Ineffective ineffective = new Ineffective();
    Weaknesses weaknesses = new Weaknesses();

    public List<List<Type>> dark(){
        compiledEffectiveness.add(strengths.dark());
        compiledEffectiveness.add(superStrengths.dark());
        compiledEffectiveness.add(weaknesses.dark());
        compiledEffectiveness.add(superWeaknesses.dark());
        compiledEffectiveness.add(ineffective.dark());
        return compiledEffectiveness;
    }

}
