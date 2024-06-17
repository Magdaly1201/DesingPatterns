package com.magdy.demo.patternstrategy.arsenalquest.controller;

import com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.Character;
import com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.types.CharacterStrategy;
import com.magdy.demo.patternstrategy.arsenalquest.strategy.chararter.weapon.behavior.WeaponStrategy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArsenalQuestController {

    @GetMapping("/character/{type}/weapon/{weaponType}")
    public ResponseEntity<?> getDuck(@PathVariable("type") CharacterStrategy type, @PathVariable("weaponType") WeaponStrategy weaponStrategy) {
        Character character = CharacterStrategy.create(type);
        character.display();
        character.setWeaponBehavior(WeaponStrategy.create(weaponStrategy));
        character.fight();

        return ResponseEntity.ok("character Type behavior: " + type);
    }
}
