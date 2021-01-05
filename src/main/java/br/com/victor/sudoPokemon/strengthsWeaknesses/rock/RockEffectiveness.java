package br.com.victor.sudoPokemon.strengthsWeaknesses.rock;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class RockEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> rock(){
        compiledEffectiveness.add(strengths.rock());
        compiledEffectiveness.add(superStrengths.rock());
        compiledEffectiveness.add(weaknesses.rock());
        compiledEffectiveness.add(superWeaknesses.rock());
        compiledEffectiveness.add(ineffective.rock());
        return compiledEffectiveness;
    }

    public List<List<Type>> rockWater(){
        compiledEffectiveness.add(strengths.rockWater());
        compiledEffectiveness.add(superStrengths.rockWater());
        compiledEffectiveness.add(weaknesses.rockWater());
        compiledEffectiveness.add(superWeaknesses.rockWater());
        compiledEffectiveness.add(ineffective.rockWater());
        return compiledEffectiveness;
    }

    public List<List<Type>> rockGround(){
        compiledEffectiveness.add(strengths.rockGround());
        compiledEffectiveness.add(superStrengths.rockGround());
        compiledEffectiveness.add(weaknesses.rockGround());
        compiledEffectiveness.add(superWeaknesses.rockGround());
        compiledEffectiveness.add(ineffective.rockGround());
        return compiledEffectiveness;
    }

    public List<List<Type>> rockFlying(){
        compiledEffectiveness.add(strengths.rockFlying());
        compiledEffectiveness.add(superStrengths.rockFlying());
        compiledEffectiveness.add(weaknesses.rockFlying());
        compiledEffectiveness.add(superWeaknesses.rockFlying());
        compiledEffectiveness.add(ineffective.rockFlying());
        return compiledEffectiveness;
    }

}
