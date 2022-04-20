package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.fairy;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class FairyEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

    public List<List<Type>> fairy(){
        compiledEffectiveness.add(strengths.fairy());
        compiledEffectiveness.add(superStrengths.fairy());
        compiledEffectiveness.add(weaknesses.fairy());
        compiledEffectiveness.add(superWeaknesses.fairy());
        compiledEffectiveness.add(ineffective.fairy());
        return compiledEffectiveness;
    }

}
