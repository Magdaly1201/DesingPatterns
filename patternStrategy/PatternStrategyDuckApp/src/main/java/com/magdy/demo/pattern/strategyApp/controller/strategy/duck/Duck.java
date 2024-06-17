package com.magdy.demo.pattern.strategyApp.controller.strategy.duck;

import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.fly.FlyBehavior;
import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
