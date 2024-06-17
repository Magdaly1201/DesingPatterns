package com.magdy.demo.pattern.strategyApp.strategy.duck.types;

import com.magdy.demo.pattern.strategyApp.strategy.duck.Duck;
import com.magdy.demo.pattern.strategyApp.strategy.duck.fly.FlyNoWay;
import com.magdy.demo.pattern.strategyApp.strategy.duck.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber duck!");
    }
}
