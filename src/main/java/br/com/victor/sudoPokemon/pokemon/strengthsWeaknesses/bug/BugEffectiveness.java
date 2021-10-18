package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.bug;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class BugEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> bug(){
        compiledEffectiveness.add(strengths.bug());
        compiledEffectiveness.add(superStrengths.bug());
        compiledEffectiveness.add(weaknesses.bug());
        compiledEffectiveness.add(superWeaknesses.bug());
        compiledEffectiveness.add(ineffective.bug());
        return compiledEffectiveness;
    }

    public List<List<Type>> bugGrass(){
        compiledEffectiveness.add(strengths.bugGrass());
        compiledEffectiveness.add(superStrengths.bugGrass());
        compiledEffectiveness.add(weaknesses.bugGrass());
        compiledEffectiveness.add(superWeaknesses.bugGrass());
        compiledEffectiveness.add(ineffective.bugGrass());
        return compiledEffectiveness;
    }

    public List<List<Type>> bugPoison(){
        compiledEffectiveness.add(strengths.bugPoison());
        compiledEffectiveness.add(superStrengths.bugPoison());
        compiledEffectiveness.add(weaknesses.bugPoison());
        compiledEffectiveness.add(superWeaknesses.bugPoison());
        compiledEffectiveness.add(ineffective.bugPoison());
        return compiledEffectiveness;
    }

    public List<List<Type>> bugFlying(){
        compiledEffectiveness.add(strengths.bugFlying());
        compiledEffectiveness.add(superStrengths.bugFlying());
        compiledEffectiveness.add(weaknesses.bugFlying());
        compiledEffectiveness.add(superWeaknesses.bugFlying());
        compiledEffectiveness.add(ineffective.bugFlying());
        return compiledEffectiveness;
    }

}
