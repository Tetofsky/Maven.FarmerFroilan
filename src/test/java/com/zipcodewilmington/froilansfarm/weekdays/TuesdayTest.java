package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.creatures.Horse;
import com.zipcodewilmington.froilansfarm.crops.BeanStalk;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TuesdayTest extends BaseDayTest{
    @Test
    public void Tuesday(){
        for (Horse h: stable1){
            froilan.mount(h);
            froilan.ride(h);
            froilan.dismount(h);
            h.eat(3, "EarCorn");
            Assert.assertTrue(h.eat(3, "EarCorn"));
            Assert.assertFalse(h.eat(3, "Tomato"));
        }
        for (Horse h: stable2){
            froilanda.mount(h);
            froilanda.ride(h);
            froilanda.dismount(h);
            h.eat(3, "EarCorn");
        }
        for (Horse h: stable3){
            froilan.mount(h);
            froilan.ride(h);
            froilan.dismount(h);
            h.eat(3, "EarCorn");
        }
        froilan.eat(1, "EarCorn");
        froilan.eat(2, "Tomato");
        froilan.eat(5, "Egg");
        froilan.eat(1, "Bean");
        froilanda.eat(2, "EarCorn");
        froilanda.eat(1, "Tomato");
        froilanda.eat(2, "Egg");
        froilanda.eat(3, "Bean");
        Tractor tractor1 = new Tractor();
        tractor1.harvest(cropRow1);
        tractor1.harvest(cropRow2);
        tractor1.harvest(cropRow3);
        tractor1.harvest(cropRow4);
        tractor1.harvest(cropRow5);
    }

}
