package br.com.victor.sudoPokemon.strengthsWeaknesses.ground;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class GroundEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> ground(){
        compiledEffectiveness.add(strengths.ground());
        compiledEffectiveness.add(superStrengths.ground());
        compiledEffectiveness.add(weaknesses.ground());
        compiledEffectiveness.add(superWeaknesses.ground());
        compiledEffectiveness.add(ineffective.ground());
        return compiledEffectiveness;
    }

}
