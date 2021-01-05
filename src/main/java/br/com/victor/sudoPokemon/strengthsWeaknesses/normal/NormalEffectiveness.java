package br.com.victor.sudoPokemon.strengthsWeaknesses.normal;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class NormalEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

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
