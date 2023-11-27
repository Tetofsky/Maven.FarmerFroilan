package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;

public interface Botanist {
    public Boolean plant(Crop crop, CropRow<Crop> cropRow);
}
