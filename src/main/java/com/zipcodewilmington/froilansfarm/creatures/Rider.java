package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.vehicles.Rideable;

public interface Rider {
    public Boolean mount(Rideable rideable);
    public Boolean dismount(Rideable rideable);
}
