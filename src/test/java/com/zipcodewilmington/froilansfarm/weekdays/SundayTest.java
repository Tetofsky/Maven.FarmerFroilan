package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.creatures.*;
import com.zipcodewilmington.froilansfarm.crops.*;
import com.zipcodewilmington.froilansfarm.structures.*;
import com.zipcodewilmington.froilansfarm.vehicles.*;
import org.junit.Assert;
import org.junit.Test;

public class SundayTest extends BaseDayTest{
    @Test
    public void Sunday(){
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
        froilan.plant(new CornStalk(), cropRow1);
        froilan.plant(new TomatoPlant(), cropRow2);
        froilan.plant(new BeanStalk(), cropRow3);
    }

    // For each day we will need the following crops:
        // 33 EarCorn
        // 3 Tomato
        // 7 Egg
        // How many Bean do the Chicken eat per day? What about the Froilan & Froilanda?
            // 2 Bean per Chicken, 1 Bean for Froilan, 3 Bean for Froilanda.
            // 34 Bean per day

}
