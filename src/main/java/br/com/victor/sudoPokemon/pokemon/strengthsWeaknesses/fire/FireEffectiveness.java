package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.fire;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class FireEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();


    public List<List<Type>> fire(){
        compiledEffectiveness.add(strengths.fire());
        compiledEffectiveness.add(superStrengths.fire());
        compiledEffectiveness.add(weaknesses.fire());
        compiledEffectiveness.add(superWeaknesses.fire());
        compiledEffectiveness.add(ineffective.fire());
        return compiledEffectiveness;
    }

    public List<List<Type>> fireFlying(){
        compiledEffectiveness.add(strengths.fireFlying());
        compiledEffectiveness.add(superStrengths.fireFlying());
        compiledEffectiveness.add(weaknesses.fireFlying());
        compiledEffectiveness.add(superWeaknesses.fireFlying());
        compiledEffectiveness.add(ineffective.fireFlying());
        return compiledEffectiveness;
    }
}
