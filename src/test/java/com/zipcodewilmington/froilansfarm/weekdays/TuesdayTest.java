package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;
import sun.security.krb5.internal.crypto.Aes128;

public class TuesdayTest extends BaseDayTest{

    @Test
    public void testTractorMove() {
        //setup();
        Boolean actual = tractor.operate();
        Assert.assertTrue(actual);

        @Test
        public void Tuesday () {
            tractor1.harvest(cropRow1);
            Assert.assertEquals(169, silo.getEdible("EarCorn"));
            tractor1.harvest(cropRow2);
            Assert.assertEquals(22, silo.getEdible("Tomato"));
            tractor1.harvest(cropRow3);
            Assert.assertEquals(169, silo.getEdible("Bean"));
            tractor1.harvest(cropRow4);
            Assert.assertEquals(238, silo.getEdible("EarCorn"));
            tractor1.harvest(cropRow5);
            Assert.assertEquals(238, silo.getEdible("Bean"));
        }
    }
}
