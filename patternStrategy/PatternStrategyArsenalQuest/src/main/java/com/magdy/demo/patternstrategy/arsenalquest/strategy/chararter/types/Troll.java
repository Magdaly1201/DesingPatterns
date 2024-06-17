package com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.types;

import com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.Character;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Troll extends Character {
    @Override
    public void display() {
        log.info("Its a Troll");
    }
}
