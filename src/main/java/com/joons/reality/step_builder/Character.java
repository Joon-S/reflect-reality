package com.joons.reality.step_builder;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.StringJoiner;

@Getter
@Setter
public class Character {

    private String name;
    private String fighterClass;
    private String wizardClass;
    private String weapon;
    private String spell;
    private List<String> abilities;

    public Character(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("-");
        sj.add(name).add(fighterClass).add(wizardClass).add(weapon).add(spell).add(abilities.toString());
        return sj.toString();
    }
}
