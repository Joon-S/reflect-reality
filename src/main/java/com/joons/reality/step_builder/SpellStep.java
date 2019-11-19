package com.joons.reality.step_builder;

public interface SpellStep {

    AbilityStep withSpell(String spell);

    BuildStep noSpell();
}
