package com.joons.reality.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Hero {

    private String name;
    private String occupation;
    private String abilities;

    private Hero(Builder builder) {
        this.name = builder.name;
        this.occupation = builder.occupation;
        this.abilities = builder.abilities;
    }

    public static class Builder {

        private String name;
        private String occupation;
        private String abilities;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withOccupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public Builder withAbilities(String abilities) {
            this.abilities = abilities;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
