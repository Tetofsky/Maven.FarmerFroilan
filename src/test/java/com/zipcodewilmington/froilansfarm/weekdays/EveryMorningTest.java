package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.creatures.Chicken;
import com.zipcodewilmington.froilansfarm.creatures.Horse;
import org.junit.Assert;
import org.junit.Test;

public class EveryMorningTest extends BaseDayTest{
        @Test
        public void DailyRoutineTest() {
            for (Horse h : stable1) {
                froilan.mount(h);
                froilan.dismount(h);
//                Boolean expected1 = h.eat(3, "EarCorn");
//                Assert.assertTrue(expected1);
//                Assert.assertFalse(h.eat(3, "Tomato"));
            }
            Assert.assertEquals(91, silo.getObject("EarCorn"));
            for (Horse h : stable2) {
                froilanda.mount(h);
                froilanda.dismount(h);
//                h.eat(3, "EarCorn");
            }
            Assert.assertEquals(82, silo.getObject("EarCorn"));
            for (Horse h : stable3) {
                froilan.mount(h);
                froilan.dismount(h);
//                h.eat(3, "EarCorn");
            }
            Assert.assertEquals(70, silo.getObject("EarCorn"));
            for (Chicken c : chickenCoop1) {
//                c.eat(2, "Bean");
            }
            Assert.assertEquals(94, silo.getObject("Bean"));
            for (Chicken c : chickenCoop2) {
//                c.eat(2, "Bean");
            }
            Assert.assertEquals(86, silo.getObject("Bean"));
            for (Chicken c : chickenCoop3) {
//                c.eat(2, "Bean");
            }
            Assert.assertEquals(78, silo.getObject("Bean"));
            for (Chicken c : chickenCoop4) {
//                c.eat(2, "Bean");
            }
            Assert.assertEquals(70, silo.getObject("Bean"));
//            froilan.eat(1, "EarCorn");
            Assert.assertEquals(69, silo.getObject("EarCorn"));
//            froilan.eat(2, "Tomato");
            Assert.assertEquals(8, silo.getObject("Tomato"));
//            froilan.eat(5, "Egg");
            Assert.assertEquals(20, silo.getObject("Egg"));
//            froilan.eat(1, "Bean");
            Assert.assertEquals(69, silo.getObject("Bean"));
//            froilanda.eat(2, "EarCorn");
            Assert.assertEquals(67, silo.getObject("EarCorn"));
//            froilanda.eat(1, "Tomato");
            Assert.assertEquals(7, silo.getObject("Tomato"));
//            froilanda.eat(2, "Egg");
            Assert.assertEquals(18, silo.getObject("Egg"));
//            froilanda.eat(3, "Bean");
            Assert.assertEquals(66, silo.getObject("Bean"));
        }
}
