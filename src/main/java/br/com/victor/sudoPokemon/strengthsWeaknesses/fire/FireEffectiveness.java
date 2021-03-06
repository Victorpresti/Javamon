package br.com.victor.sudoPokemon.strengthsWeaknesses.fire;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class FireEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();


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
