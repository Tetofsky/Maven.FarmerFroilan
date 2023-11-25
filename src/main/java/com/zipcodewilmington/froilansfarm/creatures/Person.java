package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;

abstract class Person implements Eater<Edible>, NoiseMaker{
    String name;

    public Person(String name){
        this.name = name;
    }


}
