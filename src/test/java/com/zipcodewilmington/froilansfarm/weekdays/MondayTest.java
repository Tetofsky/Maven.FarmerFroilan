package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.creatures.Pilot;
import com.zipcodewilmington.froilansfarm.crops.*;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class MondayTest extends BaseDayTest{

    @Test
    public void testCropDusterRemoveFromList(){
        setup();


    }
    @Test
    public void testCropDusterFly(){
        //setup();
        Boolean actual = cropDuster.fly(Field);
        Assert.assertTrue(actual);
    }
    @Test
    public void testCropDusterFertilize(){
        //setup();
        Boolean actual = cropDuster.fertilize(CropRow);
        Assert.assertTrue(actual);
    }

    @Test
    public void testCropRow1Fertilize(){
        //setup();
        Boolean actual = cropRow1.get(EarCorn).hasBeenFertilized;
        Assert.assertTrue(actual);
    }

    @Test
    public void testCropRow2Fertilize(){
        //setup();
        Boolean actual = cropRow1.get(Tomato).hasBeenFertilized;
        Assert.assertTrue(actual);
    }

    @Test
    public void testCropRow3Fertilize(){
        //setup();
        Boolean actual = cropRow1.get(Bean).hasBeenFertilized;
        Assert.assertTrue(actual);
    }

    @Test
    public void testCropRow4Fertilize(){
        //setup();
        Boolean actual = cropRow1.get(EarCorn).hasBeenFertilized;
        Assert.assertTrue(actual);
    }

    @Test
    public void testCropRow5Fertilize(){
        //setup();
        Boolean actual = cropRow1.get(Tomato).hasBeenFertilized;
        Assert.assertTrue(actual);
    }
}
