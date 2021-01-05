package br.com.victor.sudoPokemon;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum Status {
    HEALTHY("Healthy", "", "", ""),
    POISONED("Poisoned", " was poisoned! ", " was hurt by poison!", " is no longer poisoned"),
    BADLY_POISONED("Badly poisoned", " was poisoned! ", "", ""),
    BURNED("Burned", " is burning! ", " was hurt by it's burn!", " is no longer burning"),
    PARALYZED("Paralyzed", " has been paralyzed, might be unable to move ", "", ""),
    ASLEEP("Asleep", " fell asleep! ", "", ""),
    FROZEN("Frozen", " is frozen solid ", "", ""),
    CONFUSED("Confused", " is confused, it might hit itself in it's confusion ", "", ""),
    NONE("None", "", "", "");

    private static final Map<String, Status> NAME = new HashMap<>();
    private static final Map<String, Status> MESSAGE_INFLICTED = new HashMap<>();
    private static final Map<String, Status> MESSAGE_DAMAGE = new HashMap<>();
    private static final Map<String, Status> MESSAGE_END = new HashMap<>();

    static {
        for (Status e : values()) {
            NAME.put(e.name, e);
            MESSAGE_INFLICTED.put(e.messageInflicted, e);
            MESSAGE_DAMAGE.put(e.messageDamage, e);
            MESSAGE_END.put(e.messageEnd, e);
        }
    }

    private final String name;
    private final String messageInflicted;
    private final String messageDamage;
    private final String messageEnd;

    Status(String name, String messageInflicted, String messageDamage, String messageEnd) {
        this.name = name;
        this.messageInflicted = messageInflicted;
        this.messageDamage = messageDamage;
        this.messageEnd = messageEnd;
    }

}
