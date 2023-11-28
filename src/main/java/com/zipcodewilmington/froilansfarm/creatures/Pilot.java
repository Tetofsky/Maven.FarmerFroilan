package com.zipcodewilmington.froilansfarm.creatures;

public class Pilot extends Person {
    public Pilot(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "I'm da pilot";
    }
}
