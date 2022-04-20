package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.water;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class WaterEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

    public List<List<Type>> water(){
        compiledEffectiveness.add(strengths.water());
        compiledEffectiveness.add(superStrengths.water());
        compiledEffectiveness.add(weaknesses.water());
        compiledEffectiveness.add(superWeaknesses.water());
        compiledEffectiveness.add(ineffective.water());
        return compiledEffectiveness;
    }

    public List<List<Type>> waterFlying(){
        compiledEffectiveness.add(strengths.waterFlying());
        compiledEffectiveness.add(superStrengths.waterFlying());
        compiledEffectiveness.add(weaknesses.waterFlying());
        compiledEffectiveness.add(superWeaknesses.waterFlying());
        compiledEffectiveness.add(ineffective.waterFlying());
        return compiledEffectiveness;
    }

    public List<List<Type>> waterIce(){
        compiledEffectiveness.add(strengths.waterIce());
        compiledEffectiveness.add(superStrengths.waterIce());
        compiledEffectiveness.add(weaknesses.waterIce());
        compiledEffectiveness.add(superWeaknesses.waterIce());
        compiledEffectiveness.add(ineffective.waterIce());
        return compiledEffectiveness;
    }

    public List<List<Type>> waterFighting(){
        compiledEffectiveness.add(strengths.waterFighting());
        compiledEffectiveness.add(superStrengths.waterFighting());
        compiledEffectiveness.add(weaknesses.waterFighting());
        compiledEffectiveness.add(superWeaknesses.waterFighting());
        compiledEffectiveness.add(ineffective.waterFighting());
        return compiledEffectiveness;
    }

    public List<List<Type>> waterPoison(){
        compiledEffectiveness.add(strengths.waterPoison());
        compiledEffectiveness.add(superStrengths.waterPoison());
        compiledEffectiveness.add(weaknesses.waterPoison());
        compiledEffectiveness.add(superWeaknesses.waterPoison());
        compiledEffectiveness.add(ineffective.waterPoison());
        return compiledEffectiveness;
    }

    public List<List<Type>> waterPsychic(){
        compiledEffectiveness.add(strengths.waterPsychic());
        compiledEffectiveness.add(superStrengths.waterPsychic());
        compiledEffectiveness.add(weaknesses.waterPsychic());
        compiledEffectiveness.add(superWeaknesses.waterPsychic());
        compiledEffectiveness.add(ineffective.waterPsychic());
        return compiledEffectiveness;
    }

}
