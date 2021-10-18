package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ghost;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class GhostEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> ghost(){
        compiledEffectiveness.add(strengths.ghost());
        compiledEffectiveness.add(superStrengths.ghost());
        compiledEffectiveness.add(weaknesses.ghost());
        compiledEffectiveness.add(superWeaknesses.ghost());
        compiledEffectiveness.add(ineffective.ghost());
        return compiledEffectiveness;
    }

    public List<List<Type>> ghostPoison(){
        compiledEffectiveness.add(strengths.ghostPoison());
        compiledEffectiveness.add(superStrengths.ghostPoison());
        compiledEffectiveness.add(weaknesses.ghostPoison());
        compiledEffectiveness.add(superWeaknesses.ghostPoison());
        compiledEffectiveness.add(ineffective.ghostPoison());
        return compiledEffectiveness;
    }

}
