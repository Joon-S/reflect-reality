package com.joons.stepbuilder;

public class Main {
    public static void main(String[] args) {
        Character wizard = CharacterStepBuilder.newBuilder()
                .name("Joon")
                .wizardClass("dd")
                .withSpell("qw123")
                .withAbility("dgbb1j2k3j")
                .noAbilities()
                .build();
        System.out.println(wizard.toString());
    }
}
