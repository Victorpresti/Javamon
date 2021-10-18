package br.com.victor.sudoPokemon.pokemon;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/*
Class that contains every single move used
 */
@Getter
public enum Moves {
    EMBER("Ember", 40, 100, Type.FIRE, "Special", 25, true, 10, Status.BURNED),
    FLAMETHROWER("Flamethrower", 90, 100, Type.FIRE, "Special", 15, true, 10, Status.FROZEN),
    FIRE_BLAST("Fire Blast", 1, 85, Type.FIRE, "Special", 5, true, 10, Status.BURNED),

    POWDER_SNOW("Powder Snow", 40, 100, Type.ICE, "Special", 25, true, 10, Status.FROZEN),
    ICE_BEAM("Ice Beam", 90, 100, Type.ICE, "Special", 10, true, 10, Status.FROZEN),
    BLIZZARD("Blizzard", 1, 70, Type.ICE, "Special", 5, true, 10, Status.FROZEN),

    THUNDER_SHOCK("Thunder Shock", 40, 100, Type.ELECTRIC, "Special", 30, true, 10, Status.PARALYZED),
    THUNDERBOLT("Thunder Bolt", 90, 100, Type.ELECTRIC, "Special", 15, true, 10, Status.PARALYZED),
    THUNDER("Thunder", 1, 70, Type.ELECTRIC, "Special", 5, true, 10, Status.PARALYZED),

    WATER_GUN("Water Gun", 40, 100, Type.WATER, "Special", 15, false, 0, Status.NONE),
    SURF("Surf", 90, 100, Type.WATER, "Special", 25, false, 0, Status.NONE),
    HYDRO_PUMP("Hydro Pump", 1, 80, Type.WATER, "Special", 5, false, 0, Status.NONE);

    /*
    Mapping multiple values on each Enum
     */
    private static final Map<String, Moves> NAME = new HashMap<>();
    private static final Map<Integer, Moves> DAMAGE = new HashMap<>();
    private static final Map<Integer, Moves> ACCURACY = new HashMap<>();
    private static final Map<Type, Moves> TYPE = new HashMap<>();
    private static final Map<String, Moves> DAMAGE_CATEGORY = new HashMap<>();
    private static final Map<Integer, Moves> PP = new HashMap<>();
    private static final Map<Boolean, Moves> ADDITIONAL_EFFECT = new HashMap<>();
    private static final Map<Integer, Moves> ADDITIONAL_EFFECT_CHANCE = new HashMap<>();
    private static final Map<Status, Moves> EFFECT = new HashMap<>();

    static {
        for (Moves e : values()) {
            NAME.put(e.name, e);
            DAMAGE.put(e.damage, e);
            ACCURACY.put(e.accuracy, e);
            TYPE.put(e.type, e);
            DAMAGE_CATEGORY.put(e.damageCategory, e);
            PP.put(e.pp, e);
            ADDITIONAL_EFFECT.put(e.additionalEffect, e);
            ADDITIONAL_EFFECT_CHANCE.put(e.additionalEffectChance, e);
            EFFECT.put(e.effect, e);
        }
    }

    /*
    Move constructor
     */
    private final String name;
    private final int damage;
    private final int accuracy;
    private final Type type;
    private final String damageCategory;
    private final int pp;
    private final Boolean additionalEffect;
    private final int additionalEffectChance;
    private final Status effect;

    Moves(String name, int damage, int accuracy, Type type, String damageCategory, int pp,
                  Boolean additionalEffect, int additionalEffectChance, Status effect ) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.type = type;
        this.damageCategory = damageCategory;
        this.pp = pp;
        this.additionalEffect = additionalEffect;
        this.additionalEffectChance = additionalEffectChance;
        this.effect = effect;
    }
}

