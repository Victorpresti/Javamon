package br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.fairy;

import br.com.victor.sudoPokemon.pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class FairyEffectiveness {

    List<List<Type>> compiledEffectiveness = new ArrayList<>();
    Strengths strengths = new Strengths();
    SuperStrengths superStrengths = new SuperStrengths();
    SuperWeaknesses superWeaknesses = new SuperWeaknesses();
    Weaknesses weaknesses = new Weaknesses();
    Ineffective ineffective = new Ineffective();

    public List<List<Type>> fairy(){
        compiledEffectiveness.add(strengths.fairy());
        compiledEffectiveness.add(superStrengths.fairy());
        compiledEffectiveness.add(weaknesses.fairy());
        compiledEffectiveness.add(superWeaknesses.fairy());
        compiledEffectiveness.add(ineffective.fairy());
        return compiledEffectiveness;
    }

}
