package br.com.victor.sudoPokemon.strengthsWeaknesses.flying;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class FlyingEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

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
