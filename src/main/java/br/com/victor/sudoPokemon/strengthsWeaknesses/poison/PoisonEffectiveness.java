package br.com.victor.sudoPokemon.strengthsWeaknesses.poison;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class PoisonEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> poison(){
        compiledEffectiveness.add(strengths.poison());
        compiledEffectiveness.add(superStrengths.poison());
        compiledEffectiveness.add(weaknesses.poison());
        compiledEffectiveness.add(superWeaknesses.poison());
        compiledEffectiveness.add(ineffective.poison());
        return compiledEffectiveness;
    }

    public List<List<Type>> poisonGround(){
        compiledEffectiveness.add(strengths.poisonGround());
        compiledEffectiveness.add(superStrengths.poisonGround());
        compiledEffectiveness.add(weaknesses.poisonGround());
        compiledEffectiveness.add(superWeaknesses.poisonGround());
        compiledEffectiveness.add(ineffective.poisonGround());
        return compiledEffectiveness;
    }

    public List<List<Type>> poisonFlying(){
        compiledEffectiveness.add(strengths.poisonFlying());
        compiledEffectiveness.add(superStrengths.poisonFlying());
        compiledEffectiveness.add(weaknesses.poisonFlying());
        compiledEffectiveness.add(superWeaknesses.poisonFlying());
        compiledEffectiveness.add(ineffective.poisonFlying());
        return compiledEffectiveness;
    }

}
