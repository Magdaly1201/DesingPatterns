package com.magdy.demo.pattern.strategyApp.controller.strategy.duck.types;

import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.Duck;
import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.fly.FlyWithWings;
import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());

    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck!");
    }
}
