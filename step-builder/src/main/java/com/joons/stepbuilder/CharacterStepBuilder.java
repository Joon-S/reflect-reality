package com.joons.stepbuilder;


import java.util.ArrayList;
import java.util.List;

public final class CharacterStepBuilder {

    // Don't use
    private CharacterStepBuilder() {}

    public static NameStep newBuilder() {
        return new CharacterStep();
    }

    private static class CharacterStep implements NameStep, ClassStep, WeaponStep, SpellStep, AbilityStep, BuildStep {

        private String name;
        private String fighterClass;
        private String wizardClass;
        private String weapon;
        private String spell;
        private List<String> abilities = new ArrayList<>();

        @Override
        public ClassStep name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public WeaponStep fighterClass(String fighterClass) {
            this.fighterClass = fighterClass;
            return this;
        }

        @Override
        public SpellStep wizardClass(String wizardClass) {
            this.wizardClass = wizardClass;
            return this;
        }

        @Override
        public AbilityStep withWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        @Override
        public BuildStep noWeapon() {
            return this;
        }

        @Override
        public AbilityStep withSpell(String spell) {
            this.spell = spell;
            return this;
        }

        @Override
        public BuildStep noSpell() {
            return this;
        }

        @Override
        public AbilityStep withAbility(String ability) {
            this.abilities.add(ability);
            return this;
        }

        @Override
        public BuildStep noMoreAbilities() {
            return this;
        }

        @Override
        public BuildStep noAbilities() {
            return this;
        }

        @Override
        public Character build() {
            Character character = new Character(name);
            if(fighterClass != null) {
                character.setFighterClass(fighterClass);
            } else {
                character.setWizardClass(wizardClass);
            }

            if(weapon != null) {
                character.setWeapon(weapon);
            } else {
                character.setSpell(spell);
            }

            if(!abilities.isEmpty()) {
                character.setAbilities(abilities);
            }

            return character;
        }
    }
}
