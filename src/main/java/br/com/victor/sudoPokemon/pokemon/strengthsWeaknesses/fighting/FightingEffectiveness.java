package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.fighting;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class FightingEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

    public List<List<Type>> fighting(){
        compiledEffectiveness.add(strengths.fighting());
        compiledEffectiveness.add(superStrengths.fighting());
        compiledEffectiveness.add(weaknesses.fighting());
        compiledEffectiveness.add(superWeaknesses.fighting());
        compiledEffectiveness.add(ineffective.fighting());
        return compiledEffectiveness;
    }

}
