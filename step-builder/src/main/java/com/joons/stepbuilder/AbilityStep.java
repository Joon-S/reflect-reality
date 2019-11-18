package com.joons.stepbuilder;

public interface AbilityStep {

    AbilityStep withAbility(String ability);
    BuildStep noMoreAbilities();
    BuildStep noAbilities();
}
