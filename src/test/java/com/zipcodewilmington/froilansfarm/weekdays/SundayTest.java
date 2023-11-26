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
        // We should update the values in silo for each day of the week
        // Also the crops' status (if crops have been planted/ fertilized) should be updated daily
        Boolean expected2 = froilan.plant(new CornStalk(), cropRow1);
        Assert.assertTrue(expected2);
        Assert.assertEquals(, cropRow1.getPlants()); // How much of each crop will grow per cropRow?
        Boolean expected3 = froilan.plant(new TomatoPlant(), cropRow2);
        Assert.assertTrue(expected3);
        Assert.assertEquals(, cropRow2.getPlants());
        Boolean expected4 = froilan.plant(new BeanStalk(), cropRow3);
        Assert.assertTrue(expected4);
        Assert.assertEquals(, cropRow3.getPlants());
    }


    // For each day we will need the following crops:
        // 33 EarCorn
        // 3 Tomato
        // 7 Egg
        // How many Bean do the Chicken eat per day? What about the Froilan & Froilanda?
            // 2 Bean per Chicken, 1 Bean for Froilan, 3 Bean for Froilanda.
            // 34 Bean per day

}
