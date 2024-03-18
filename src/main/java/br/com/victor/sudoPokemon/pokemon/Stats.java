package br.com.victor.sudoPokemon.pokemon;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
public class Stats implements Serializable {

    private int level;
    private int hitpoints;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

    public Stats(int level, int hitpoints, int attack, int defense, int specialAttack, int specialDefense, int speed) {
        this.level = level;
        this.hitpoints = hitpoints;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

    public Stats() {
        this.level = 1;
        this.hitpoints = 1;
        this.attack = 1;
        this.defense = 1;
        this.specialAttack = 1;
        this.specialDefense = 1;
        this.speed = 1;
    }
}
