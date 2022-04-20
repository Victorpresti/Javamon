package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.electric;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class ElectricEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

    public List<List<Type>> electric(){
        compiledEffectiveness.add(strengths.electric());
        compiledEffectiveness.add(superStrengths.electric());
        compiledEffectiveness.add(weaknesses.electric());
        compiledEffectiveness.add(superWeaknesses.electric());
        compiledEffectiveness.add(ineffective.electric());
        return compiledEffectiveness;
    }

    public List<List<Type>> electricFlying(){
        compiledEffectiveness.add(strengths.electricFlying());
        compiledEffectiveness.add(superStrengths.electricFlying());
        compiledEffectiveness.add(weaknesses.electricFlying());
        compiledEffectiveness.add(superWeaknesses.electricFlying());
        compiledEffectiveness.add(ineffective.electricFlying());
        return compiledEffectiveness;
    }

    public List<List<Type>> electricSteel(){
        compiledEffectiveness.add(strengths.electricSteel());
        compiledEffectiveness.add(superStrengths.electricSteel());
        compiledEffectiveness.add(weaknesses.electricSteel());
        compiledEffectiveness.add(superWeaknesses.electricSteel());
        compiledEffectiveness.add(ineffective.electricSteel());
        return compiledEffectiveness;
    }

}
