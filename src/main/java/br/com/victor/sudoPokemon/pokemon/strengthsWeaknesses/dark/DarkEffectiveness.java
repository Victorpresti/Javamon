package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.dark;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class DarkEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Ineffective ineffective = new Ineffective();
    final Weaknesses weaknesses = new Weaknesses();

    public List<List<Type>> dark(){
        compiledEffectiveness.add(strengths.dark());
        compiledEffectiveness.add(superStrengths.dark());
        compiledEffectiveness.add(weaknesses.dark());
        compiledEffectiveness.add(superWeaknesses.dark());
        compiledEffectiveness.add(ineffective.dark());
        return compiledEffectiveness;
    }

}
