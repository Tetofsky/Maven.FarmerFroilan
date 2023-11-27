package com.zipcodewilmington.froilansfarm.structures;

import java.util.HashMap;

public abstract class Storage<K> extends HashMap<K, Integer> implements Farm {

    public Boolean addObject(Integer amountToAdd, K thingToAdd) {
        this.put(thingToAdd, this.get(thingToAdd) + amountToAdd);
        return true;
    }

    public boolean removeObject(Integer amountToRemove, K thingToRemove) {
        this.put(thingToRemove, this.get(thingToRemove) - amountToRemove);
        return true;
    }
}
