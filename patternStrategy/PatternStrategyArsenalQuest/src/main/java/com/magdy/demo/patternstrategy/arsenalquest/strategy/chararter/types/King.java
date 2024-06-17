package com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.types;

import com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.Character;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class King extends Character {

    @Override
    public void display() {
        log.info("its a King");
    }
}
