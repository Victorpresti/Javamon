package br.com.victor.sudoPokemon.strengthsWeaknesses.electric;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class ElectricEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

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
