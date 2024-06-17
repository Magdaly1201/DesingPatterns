package com.magdy.demo.pattern.strategyApp.controller;

import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.Duck;
import com.magdy.demo.pattern.strategyApp.controller.strategy.duck.types.DuckStrategy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DuckController {

    @GetMapping("duck/{type}/")
    public ResponseEntity<?> getDuck(@PathVariable("type") DuckStrategy type){
        Duck duck = DuckStrategy.createDuck(type);
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
        return ResponseEntity.ok("Duck Type: " + type);
    }
}
