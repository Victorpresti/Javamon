package br.com.victor.sudoPokemon.strengthsWeaknesses.fighting;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class FightingEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> fighting(){
        compiledEffectiveness.add(strengths.fighting());
        compiledEffectiveness.add(superStrengths.fighting());
        compiledEffectiveness.add(weaknesses.fighting());
        compiledEffectiveness.add(superWeaknesses.fighting());
        compiledEffectiveness.add(ineffective.fighting());
        return compiledEffectiveness;
    }

}
