package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.steel;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class SteelEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

    public List<List<Type>> steel(){
        compiledEffectiveness.add(strengths.steel());
        compiledEffectiveness.add(superStrengths.steel());
        compiledEffectiveness.add(weaknesses.steel());
        compiledEffectiveness.add(superWeaknesses.steel());
        compiledEffectiveness.add(ineffective.steel());
        return compiledEffectiveness;
    }

}
