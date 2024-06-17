package com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.weapon.behavior;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        log.info("use weapon knife Behavior");
    }
}
