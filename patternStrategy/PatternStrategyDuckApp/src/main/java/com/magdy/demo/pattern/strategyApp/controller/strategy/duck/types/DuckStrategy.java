package com.magdy.demo.pattern.strategyApp.controller.strategy.duck.types;

import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.Duck;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum DuckStrategy {

    MallardDuck,
    RedheadDuck,
    DecoyDuck,
    RubberDuck;

    private static final Map<DuckStrategy, Supplier<Duck>> duckMap = new HashMap<>();

    static {
        duckMap.put(MallardDuck, MallardDuck::new);
        duckMap.put(DecoyDuck, DecoyDuck::new);
        duckMap.put(RedheadDuck, RedheadDuck::new);
        duckMap.put(RubberDuck, RubberDuck::new);
    }

    public static Duck createDuck(DuckStrategy type) {
        Supplier<Duck> duckSupplier = duckMap.get(type);
        if (duckSupplier != null) {
            return duckSupplier.get();
        }
        throw new IllegalArgumentException("Unknown duck type: " + type);
    }
}
