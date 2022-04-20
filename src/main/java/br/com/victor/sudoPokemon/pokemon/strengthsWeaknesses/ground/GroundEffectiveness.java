package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ground;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class GroundEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

    public List<List<Type>> ground(){
        compiledEffectiveness.add(strengths.ground());
        compiledEffectiveness.add(superStrengths.ground());
        compiledEffectiveness.add(weaknesses.ground());
        compiledEffectiveness.add(superWeaknesses.ground());
        compiledEffectiveness.add(ineffective.ground());
        return compiledEffectiveness;
    }

}
