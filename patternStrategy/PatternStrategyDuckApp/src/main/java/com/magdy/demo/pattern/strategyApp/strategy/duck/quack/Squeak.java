package com.magdy.demo.pattern.strategyApp.strategy.duck.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
