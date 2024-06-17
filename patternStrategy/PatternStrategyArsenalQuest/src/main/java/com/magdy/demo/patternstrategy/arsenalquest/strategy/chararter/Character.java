package com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter;

import com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.weapon.behavior.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public abstract void display();

    public void fight() {
        this.weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
