package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.grass;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class GrassEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

    public List<List<Type>> grass(){
        compiledEffectiveness.add(strengths.grass());
        compiledEffectiveness.add(superStrengths.grass());
        compiledEffectiveness.add(weaknesses.grass());
        compiledEffectiveness.add(superWeaknesses.grass());
        compiledEffectiveness.add(ineffective.grass());
        return compiledEffectiveness;
    }

    public List<List<Type>> grassPoison(){
        compiledEffectiveness.add(strengths.grassPoison());
        compiledEffectiveness.add(superStrengths.grassPoison());
        compiledEffectiveness.add(weaknesses.grassPoison());
        compiledEffectiveness.add(superWeaknesses.grassPoison());
        compiledEffectiveness.add(ineffective.grassPoison());
        return compiledEffectiveness;
    }

    public List<List<Type>> grassPsychic(){
        compiledEffectiveness.add(strengths.grassPsychic());
        compiledEffectiveness.add(superStrengths.grassPsychic());
        compiledEffectiveness.add(weaknesses.grassPsychic());
        compiledEffectiveness.add(superWeaknesses.grassPsychic());
        compiledEffectiveness.add(ineffective.grassPsychic());
        return compiledEffectiveness;
    }
}
