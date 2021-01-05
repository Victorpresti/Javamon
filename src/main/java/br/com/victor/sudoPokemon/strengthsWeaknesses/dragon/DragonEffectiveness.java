package br.com.victor.sudoPokemon.strengthsWeaknesses.dragon;

import br.com.victor.sudoPokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class DragonEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> dragon(){
        compiledEffectiveness.add(strengths.dragon());
        compiledEffectiveness.add(superStrengths.dragon());
        compiledEffectiveness.add(weaknesses.dragon());
        compiledEffectiveness.add(superWeaknesses.dragon());
        compiledEffectiveness.add(ineffective.dragon());
        return compiledEffectiveness;
    }

    public List<List<Type>> dragonFlying(){
        compiledEffectiveness.add(strengths.dragonFlying());
        compiledEffectiveness.add(superStrengths.dragonFlying());
        compiledEffectiveness.add(weaknesses.dragonFlying());
        compiledEffectiveness.add(superWeaknesses.dragonFlying());
        compiledEffectiveness.add(ineffective.dragonFlying());
        return compiledEffectiveness;
    }

}
