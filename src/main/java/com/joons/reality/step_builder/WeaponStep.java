package com.joons.reality.step_builder;

public interface WeaponStep {

    AbilityStep withWeapon(String weapon);
    BuildStep noWeapon();
}
