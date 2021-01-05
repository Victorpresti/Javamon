package br.com.victor.sudoPokemon.strengthsWeaknesses.ice;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class IceEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> ice(){
        compiledEffectiveness.add(strengths.ice());
        compiledEffectiveness.add(superStrengths.ice());
        compiledEffectiveness.add(weaknesses.ice());
        compiledEffectiveness.add(superWeaknesses.ice());
        compiledEffectiveness.add(ineffective.ice());
        return compiledEffectiveness;
    }

    public List<List<Type>> iceFlying(){
        compiledEffectiveness.add(strengths.iceFlying());
        compiledEffectiveness.add(superStrengths.iceFlying());
        compiledEffectiveness.add(weaknesses.iceFlying());
        compiledEffectiveness.add(superWeaknesses.iceFlying());
        compiledEffectiveness.add(ineffective.iceFlying());
        return compiledEffectiveness;
    }

    public List<List<Type>> icePsychic(){
        compiledEffectiveness.add(strengths.icePsychic());
        compiledEffectiveness.add(superStrengths.icePsychic());
        compiledEffectiveness.add(weaknesses.icePsychic());
        compiledEffectiveness.add(superWeaknesses.icePsychic());
        compiledEffectiveness.add(ineffective.icePsychic());
        return compiledEffectiveness;
    }

}
