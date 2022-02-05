package br.com.victor.sudoPokemon.fight;

import br.com.victor.sudoPokemon.pokemon.Moves;
import br.com.victor.sudoPokemon.pokemon.Pokemon;
import br.com.victor.sudoPokemon.pokemon.Status;
import br.com.victor.sudoPokemon.pokemon.Type;

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
            if (!isItImmune(defender, move)) {
                defender.setStatus(move.getEffect());
                System.out.println(defender.getName() + move.getEffect().getMessageInflicted());
            }

        }
    }
    private boolean isItImmune(Pokemon defender, Moves move) {
        if (defender.getType().contains(Type.NORMAL)){
            if (move.getName().contains("Body Slam")) return true;
            return false;
        }
        if (defender.getType().contains(Type.FIRE)){
            if (move.getEffect().equals(Status.BURNED)) return true;
            return false;
        }
        if (defender.getType().contains(Type.ELECTRIC)){
            if (move.getEffect().equals(Status.PARALYZED)) return true;
            return false;
        }
        if (defender.getType().contains(Type.GRASS)){
            if (move.getName().contains("Leech Seed") || move.getName().contains("Spore") || move.getName().contains("Powder")) return true;
            return false;
        }
        if (defender.getType().contains(Type.POISON)){
            if (move.getEffect().equals(Status.POISONED) || move.getEffect().equals(Status.BADLY_POISONED)) return true;
            return false;
        }
        if (defender.getType().contains(Type.GROUND)){
            if (move.getName().contains("Thunder Wave")) return true;
            return false;
        }
        if (defender.getType().contains(Type.ROCK)){}

        if (defender.getType().contains(Type.ICE)){
            if (move.getName().contains("Sheer Cold") || move.getEffect().equals(Status.FROZEN)) return true;
            return false;
        }
        if (defender.getType().contains(Type.GHOST)){}

        if (defender.getType().contains(Type.DARK)){}

        if (defender.getType().contains(Type.STEEL)){
            if (move.getEffect().equals(Status.POISONED) || move.getEffect().equals(Status.BADLY_POISONED)) return true;
            return false;
        }
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
