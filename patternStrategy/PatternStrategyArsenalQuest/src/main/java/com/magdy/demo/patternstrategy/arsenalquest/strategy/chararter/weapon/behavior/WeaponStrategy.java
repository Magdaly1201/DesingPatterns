package com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.weapon.behavior;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum WeaponStrategy {
    Axe,
    Knife,
    Sword,
    BowAndArrow, SwordBehavior;

    private static final Map<WeaponStrategy, Supplier<WeaponBehavior>> weaponMap = new HashMap<>();

    static {
        weaponMap.put(Axe, AxeBehavior::new);
        weaponMap.put(Knife, KnifeBehavior::new);
        weaponMap.put(Sword, SwordBehavior::new);
        weaponMap.put(BowAndArrow, BowAndArrowBehavior::new);
    }

    public static WeaponBehavior create(WeaponStrategy type) {

        Supplier<WeaponBehavior> weaponBehaviorSupplier = weaponMap.get(type);
        if (weaponBehaviorSupplier != null) {
            return weaponBehaviorSupplier.get();
        }
        throw new IllegalArgumentException("Unknown weapon type: " + type);
    }

}
