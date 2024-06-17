package com.magdy.demo.pattern.strategyApp.controller.strategy.duck.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can’t fly");
    }
}
