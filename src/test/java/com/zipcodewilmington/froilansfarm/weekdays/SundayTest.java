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
        Boolean expectedCrop1 = froilan.plant(new CornStalk<>(), cropRow1);
        Assert.assertTrue(expectedCrop1);
//        Assert.assertEquals(69, cropRow1.yield()); // How much of each crop will grow per cropRow?
        Boolean expectedCrop2 = froilan.plant(new TomatoPlant<>(), cropRow2);
        Assert.assertTrue(expectedCrop2);
//        Assert.assertEquals(12, cropRow2.yield());
        Boolean expectedCrop3 = froilan.plant(new BeanStalk<>(), cropRow3);
        Assert.assertTrue(expectedCrop3);
//        Assert.assertEquals(69, cropRow3.yield());
        Boolean expectedCrop4 = froilan.plant(new CornStalk<>(), cropRow4);
        Assert.assertTrue(expectedCrop4);
//        Assert.assertEquals(69, cropRow4.yield());
        Boolean expectedCrop5 = froilan.plant(new BeanStalk<>(), cropRow5);
        Assert.assertTrue(expectedCrop5);
//        Assert.assertEquals(69, cropRow5.yield());

        // CornStalk & BeanStalk yield 69 Edible per cycle
        // TomatoPlant yields 12 Edible per cycle
    }


    // For each day we will need the following crops:
        // 33 EarCorn
        // 3 Tomato
        // 7 Egg
        // How many Bean do the Chicken eat per day? What about the Froilan & Froilanda?
            // 2 Bean per Chicken, 1 Bean for Froilan, 3 Bean for Froilanda.
            // 34 Bean per day

}
