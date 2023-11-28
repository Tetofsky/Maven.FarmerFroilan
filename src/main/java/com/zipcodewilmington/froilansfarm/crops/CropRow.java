package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.structures.Storage;

public class CropRow <P extends Crop> extends Storage {
    @Override
    public Object getObject(Object object) {
        return object;
    }
}
