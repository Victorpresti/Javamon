package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.dragon;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class DragonEffectiveness {

    final List<List<Type>> compiledEffectiveness = new ArrayList<>();
    final Strengths strengths = new Strengths();
    final SuperStrengths superStrengths = new SuperStrengths();
    final SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    final Weaknesses weaknesses = new Weaknesses();
    final Ineffective ineffective = new Ineffective();

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
