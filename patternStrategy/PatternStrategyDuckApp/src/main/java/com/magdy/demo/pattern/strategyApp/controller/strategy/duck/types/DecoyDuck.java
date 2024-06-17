package com.magdy.demo.pattern.strategyApp.controller.strategy.duck.types;

import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.Duck;
import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.fly.FlyNoWay;
import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck!");
    }
}
