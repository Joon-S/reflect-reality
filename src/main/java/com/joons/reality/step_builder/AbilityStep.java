package com.joons.reality.step_builder;

public interface AbilityStep {

    AbilityStep withAbility(String ability);
    BuildStep noMoreAbilities();
    BuildStep noAbilities();
}
