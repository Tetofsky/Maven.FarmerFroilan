package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.structures.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class WednesdayTest {
    @Test
    public void Wednesday(){
        for (Chicken c: chickenCoop1){
            Egg e = c.layEgg();
//            e.randomFertilize();
            if (e.hasBeenFertilized()){
                int initialChickens = chickenCoop1.size();
                chickenCoop1.add(new Chicken());
                Assert.assertEquals(1, chickenCoop1.size() - initialChickens);
            }
            else {
                int initialEggs = silo.getEdible("Egg");
                silo.add(1, e);
                Assert.assertEquals(1, silo.getEdible("Egg") - initialEggs);
            }
        }
        for (Chicken c: chickenCoop2){
            Egg e = c.layEgg();
//            e.randomFertilize();
            if (e.hasBeenFertilized()){
                int initialChickens = chickenCoop2.size();
                chickenCoop1.add(new Chicken());
                Assert.assertEquals(1, chickenCoop2.size() - initialChickens);
            }
            else {
                int initialEggs = silo.getEdible("Egg");
                silo.add(1, e);
                Assert.assertEquals(1, silo.getEdible("Egg") - initialEggs);
            }
        }
        for (Chicken c: chickenCoop3){
            Egg e = c.layEgg();
//            e.randomFertilize();
            if (e.hasBeenFertilized()){
                int initialChickens = chickenCoop3.size();
                chickenCoop1.add(new Chicken());
                Assert.assertEquals(1, chickenCoop3.size() - initialChickens);
            }
            else {
                int initialEggs = silo.getEdible("Egg");
                silo.add(1, e);
                Assert.assertEquals(1, silo.getEdible("Egg") - initialEggs);
            }
        }
        for (Chicken c: chickenCoop4){
            Egg e = c.layEgg();
//            e.randomFertilize();
            if (e.hasBeenFertilized()){
                int initialChickens = chickenCoop4.size();
                chickenCoop1.add(new Chicken());
                Assert.assertEquals(1, chickenCoop4.size() - initialChickens);
            }
            else {
                int initialEggs = silo.getEdible("Egg");
                silo.add(1, e);
                Assert.assertEquals(1, silo.getEdible("Egg") - initialEggs);
            }
        }
    }
}
