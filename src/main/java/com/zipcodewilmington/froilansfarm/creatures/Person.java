package com.zipcodewilmington.froilansfarm.creatures;

public abstract class Person implements Eater<Object>, NoiseMaker{
    String name;

    public Person(String name){
        this.name = name;
    }


}
