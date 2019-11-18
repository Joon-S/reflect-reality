package com.joons.stepbuilder;

public interface SpellStep {

    AbilityStep withSpell(String spell);

    BuildStep noSpell();
}
