package com.magdy.demo.pattern.strategyApp.strategy.duck.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
