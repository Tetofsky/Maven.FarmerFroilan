package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.creatures.*;
import com.zipcodewilmington.froilansfarm.crops.*;
import com.zipcodewilmington.froilansfarm.structures.*;
import com.zipcodewilmington.froilansfarm.vehicles.*;
import org.junit.After;
import org.junit.Before;

public class BaseDayTest {
    Farmer froilan;
    Pilot froilanda;
    Field field; // Do we need to include <> in each storage/dwelling?
    CropRow cropRow1, cropRow2, cropRow3, cropRow4, cropRow5;
    ChickenCoop chickenCoop1, chickenCoop2, chickenCoop3, chickenCoop4;
    Stable stable1, stable2, stable3;
    Tractor tractor;
    CropDuster cropDuster;
    Silo silo;

    @Before
    public void setup(){
        froilan = new Farmer("Froilan");
        froilanda = new Pilot("Froilanda");
        field = new Field<CropRow>();
        cropRow1 = new CropRow<CropType>();
        cropRow2 = new CropRow<CropType>();
        cropRow3 = new CropRow<CropType>();
        cropRow4 = new CropRow<CropType>();
        cropRow5 = new CropRow<CropType>();
        field.add(cropRow1);
        field.add(cropRow2);
        field.add(cropRow3);
        field.add(cropRow4);
        field.add(cropRow5);
        chickenCoop1 = new ChickenCoop();
        chickenCoop2 = new ChickenCoop();
        chickenCoop3 = new ChickenCoop();
        chickenCoop4 = new ChickenCoop();
        chickenCoop1.add(new Chicken());
        chickenCoop1.add(new Chicken());
        chickenCoop1.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop4.add(new Chicken());
        chickenCoop4.add(new Chicken());
        chickenCoop4.add(new Chicken());
        chickenCoop4.add(new Chicken());
        stable1 = new Stable();
        stable2 = new Stable();
        stable3 = new Stable();
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable2.add(new Horse());
        stable2.add(new Horse());
        stable2.add(new Horse());
        stable3.add(new Horse());
        stable3.add(new Horse());
        stable3.add(new Horse());
        stable3.add(new Horse());
        tractor = new Tractor();
        cropDuster = new CropDuster();
        silo = new Silo();
        silo.add(100, new EarCorn(true, true)); // Add a baseline amount of food?
        silo.add(10, new Tomato(true, true));
        silo.add(100, new Bean(true, true));
        silo.add(25, new Egg(true, false));
    }

    @After
    public void tearDown(){ // Should we reset after each test? Or can it carry over to the following day somehow?

    }
}
