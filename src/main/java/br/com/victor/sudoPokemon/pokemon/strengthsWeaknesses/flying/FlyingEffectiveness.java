package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.flying;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class FlyingEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

    public List<List<Type>> flying(){
        compiledEffectiveness.add(strengths.flying());
        compiledEffectiveness.add(superStrengths.flying());
        compiledEffectiveness.add(weaknesses.flying());
        compiledEffectiveness.add(superWeaknesses.flying());
        compiledEffectiveness.add(ineffective.flying());
        return compiledEffectiveness;
    }

    public List<List<Type>> flyingNormal(){
        compiledEffectiveness.add(strengths.flyingNormal());
        compiledEffectiveness.add(superStrengths.flyingNormal());
        compiledEffectiveness.add(weaknesses.flyingNormal());
        compiledEffectiveness.add(superWeaknesses.flyingNormal());
        compiledEffectiveness.add(ineffective.flyingNormal());
        return compiledEffectiveness;
    }

}
