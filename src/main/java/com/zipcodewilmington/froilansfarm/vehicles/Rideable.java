package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.creatures.Rider;

public interface Rideable<Ridertype extends Rider> {
    abstract Boolean move();
}
