package com.magdy.demo.pattern.strategyApp.strategy.duck.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
