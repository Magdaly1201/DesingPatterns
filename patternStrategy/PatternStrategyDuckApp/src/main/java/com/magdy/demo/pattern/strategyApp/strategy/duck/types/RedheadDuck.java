package com.magdy.demo.pattern.strategyApp.strategy.duck.types;

import com.magdy.demo.pattern.strategyApp.strategy.duck.Duck;
import com.magdy.demo.pattern.strategyApp.strategy.duck.fly.FlyWithWings;
import com.magdy.demo.pattern.strategyApp.strategy.duck.quack.MuteQuack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Redhead duck!");
    }
}
