package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.normal;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class NormalEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

    public List<List<Type>> normal(){
        compiledEffectiveness.add(strengths.normal());
        compiledEffectiveness.add(superStrengths.normal());
        compiledEffectiveness.add(weaknesses.normal());
        compiledEffectiveness.add(superWeaknesses.normal());
        compiledEffectiveness.add(ineffective.normal());
        return compiledEffectiveness;
    }

    public List<List<Type>> normalFairy(){
        compiledEffectiveness.add(strengths.normalFairy());
        compiledEffectiveness.add(superStrengths.normalFairy());
        compiledEffectiveness.add(weaknesses.normalFairy());
        compiledEffectiveness.add(superWeaknesses.normalFairy());
        compiledEffectiveness.add(ineffective.normalFairy());
        return compiledEffectiveness;
    }

}
