package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.pokemon.Moves;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.pokemon.Status;

/*
This class manages all status effects
 */
public class StatusManager {

    /*
    Check the move used for additional effect and apply them.
    TODO add every status effect
     */
    public void manage(Pokemon attacker, Pokemon defender, Moves move, int n){
        if (n <= move.getAdditionalEffectChance()){
            if (move.getEffect() == Status.ASLEEP ||
                move.getEffect() == Status.POISONED ||
                move.getEffect() == Status.BADLY_POISONED ||
                move.getEffect() == Status.PARALYZED ||
                move.getEffect() == Status.BURNED ||
                move.getEffect() == Status.FROZEN) {
                manageMainStatus(defender, move);
            }
        }
    }

    /*
    Private implementation, checks for status and immunity before applying a status effect
     */
    private void manageMainStatus(Pokemon defender, Moves move) {
        if (defender.getStatus() != Status.ASLEEP &&
                defender.getStatus() != Status.POISONED &&
                defender.getStatus() != Status.BADLY_POISONED &&
                defender.getStatus() != Status.PARALYZED &&
                defender.getStatus() != Status.BURNED &&
                defender.getStatus() != Status.FROZEN) {
            if (!isItImmune()){
                defender.setStatus(move.getEffect());
                System.out.println(defender.getName() + move.getEffect().getMessageInflicted());
            }

        }
    }
    private boolean isItImmune(){
        return false;
    }

    /*
    If the Pokemon has any status effect, this class does a post-turn description and necessary changes
     */
    public void postTurn(Pokemon pokemon){
        switch(pokemon.getStatus()){
            case POISONED:
                System.out.println(pokemon.getName() + Status.POISONED.getMessageDamage());
                pokemon.getCurrentStats().setHitpoints(pokemon.getCurrentStats().getHitpoints() - (pokemon.getMaxHitpoints() / 8));
                System.out.println(pokemon.getName() + " lost " + pokemon.getMaxHitpoints() / 8 + " hitpoints");
                break;
            case BURNED:
                System.out.println(pokemon.getName() + Status.BURNED.getMessageDamage());
                pokemon.getCurrentStats().setHitpoints(pokemon.getCurrentStats().getHitpoints() - (pokemon.getMaxHitpoints() / 8));
                System.out.println(pokemon.getName() + " lost " + pokemon.getMaxHitpoints() / 8 + " hitpoints");
                break;
        }
    }
}
