package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.creatures.Chicken;
import com.zipcodewilmington.froilansfarm.creatures.Farmer;
import com.zipcodewilmington.froilansfarm.creatures.Horse;
import com.zipcodewilmington.froilansfarm.creatures.Pilot;
import com.zipcodewilmington.froilansfarm.creatures.Egg;
import com.zipcodewilmington.froilansfarm.crops.*;
import com.zipcodewilmington.froilansfarm.structures.ChickenCoop;
import com.zipcodewilmington.froilansfarm.structures.Silo;
import com.zipcodewilmington.froilansfarm.structures.Stable;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SundayTest {
    Farmer froilan = new Farmer("Froilan");
    Pilot froilanda = new Pilot("Froilanda");
    CropRow cropRow1 = new CropRow<CropType>();
    CropRow cropRow2 = new CropRow<CropType>();
    CropRow cropRow3 = new CropRow<CropType>();
//    CropRow cropRow4 = new CropRow<~>();
//    CropRow cropRow5 = new CropRow<~>();
    Field field = new Field<CropRow>(); // Do we need to include <> in each storage/dwelling?
    Chicken chicken1 = new Chicken();
    Chicken chicken2 = new Chicken();
    Chicken chicken3 = new Chicken();
    Chicken chicken4 = new Chicken();
    Chicken chicken5 = new Chicken();
    Chicken chicken6 = new Chicken();
    Chicken chicken7 = new Chicken();
    Chicken chicken8 = new Chicken();
    Chicken chicken9 = new Chicken();
    Chicken chicken10 = new Chicken();
    Chicken chicken11 = new Chicken();
    Chicken chicken12 = new Chicken();
    Chicken chicken13 = new Chicken();
    Chicken chicken14 = new Chicken();
    Chicken chicken15 = new Chicken();
    ChickenCoop chickenCoop1 = new ChickenCoop();
    ChickenCoop chickenCoop2 = new ChickenCoop();
    ChickenCoop chickenCoop3 = new ChickenCoop();
    ChickenCoop chickenCoop4 = new ChickenCoop();
    Horse horse1 = new Horse();
    Horse horse2 = new Horse();
    Horse horse3 = new Horse();
    Horse horse4 = new Horse();
    Horse horse5 = new Horse();
    Horse horse6 = new Horse();
    Horse horse7 = new Horse();
    Horse horse8 = new Horse();
    Horse horse9 = new Horse();
    Horse horse10 = new Horse();
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();
    Stable stable3 = new Stable();
    Tractor tractor = new Tractor();
    CropDuster cropDuster = new CropDuster();
    Silo silo = new Silo(); // Add a baseline amount of food?
    @Before
    public void setup(){ // Should we have everything in setup or test things as they occur?
        for (Horse h: stable1){
            froilan.mount(h);
            froilan.ride(h);
            froilan.dismount(h);
            h.eat(3, EarCorn);
        }
        for (Horse h: stable2){
            froilanda.mount(h);
            froilanda.ride(h);
            froilanda.dismount(h);
            h.eat(3, EarCorn);
        }
        for (Horse h: stable3){
            froilan.mount(h);
            froilan.ride(h);
            froilan.dismount(h);
            h.eat(3, EarCorn);
        }
        froilan.eat(1, EarCorn);
        froilan.eat(2, Tomato);
        froilan.eat(5, Egg);
        froilanda.eat(2, EarCorn);
        froilanda.eat(1, Tomato);
        froilanda.eat(2, Egg);
        froilan.plant(new CornStalk(), cropRow1);
        froilan.plant(new TomatoPlant(), cropRow2);
        froilan.plant(new BeanStalk(), cropRow3);
    }

    @After
    public void tearDown(){ // Should we reset after each test? Or Can it carry over to the following day somehow?

    }

    @Test
    public void Sunday(){

    }
}
