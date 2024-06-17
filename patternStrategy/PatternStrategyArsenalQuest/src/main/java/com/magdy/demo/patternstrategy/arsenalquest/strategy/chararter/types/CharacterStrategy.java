package com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.types;

import com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.Character;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum CharacterStrategy {

    King,
    Knight,
    Queen,
    Troll;

    private static final Map<CharacterStrategy, Supplier<Character>> chararterMap = new HashMap<>();

    static {
        chararterMap.put(King, King::new);
        chararterMap.put(Knight, Knight::new);
        chararterMap.put(Queen, Queen::new);
        chararterMap.put(Troll, Troll::new);
    }

    public static Character create(CharacterStrategy type) {

        Supplier<Character> characterSupplier = chararterMap.get(type);
        if (characterSupplier != null) {
            return characterSupplier.get();
        }
        throw new IllegalArgumentException("Unknown character type: " + type);
    }
}
