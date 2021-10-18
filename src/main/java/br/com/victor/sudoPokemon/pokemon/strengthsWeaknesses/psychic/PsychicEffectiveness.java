package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.psychic;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class PsychicEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> psychic(){
        compiledEffectiveness.add(strengths.psychic());
        compiledEffectiveness.add(superStrengths.psychic());
        compiledEffectiveness.add(weaknesses.psychic());
        compiledEffectiveness.add(superWeaknesses.psychic());
        compiledEffectiveness.add(ineffective.psychic());
        return compiledEffectiveness;
    }

    public List<List<Type>> psychicFairy(){
        compiledEffectiveness.add(strengths.psychicFairy());
        compiledEffectiveness.add(superStrengths.psychicFairy());
        compiledEffectiveness.add(weaknesses.psychicFairy());
        compiledEffectiveness.add(superWeaknesses.psychicFairy());
        compiledEffectiveness.add(ineffective.psychicFairy());
        return compiledEffectiveness;
    }

}
