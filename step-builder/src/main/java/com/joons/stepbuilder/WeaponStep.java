package com.joons.stepbuilder;

public interface WeaponStep {

    AbilityStep withWeapon(String weapon);
    BuildStep noWeapon();
}
