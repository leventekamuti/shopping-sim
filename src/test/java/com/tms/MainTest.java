package com.tms;

import com.tms.Promotions.Promotion;
import com.tms.Promotions.Promotion2A1C;
import com.tms.Promotions.PromotionD;
import com.tms.Promotions.PromotionED;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MainTest {

    // Minden teszten átmegy

    static List<Promotion> promotions = null;
    static Shop session = null;

    @BeforeAll
    public static void setUp() throws Exception {
        promotions = List.of(new PromotionD(), new Promotion2A1C(), new PromotionED());
        session = new Shop(promotions);
    }

    @Test
    public void test1(){
        String[] args = "[\"A\", \"A\", \"B\"]".split(" ");

        Assertions.assertEquals(130, session.calculateTotal(Main.fixInput(args)), 0.01);
    }

    @Test
    public void test2(){
        String[] args = "[\"D\", \"D\", \"D\", \"D\", \"D\"]".split(" ");

        Assertions.assertEquals(40, session.calculateTotal(Main.fixInput(args)), 0.01);
    }

    @Test
    public void test3(){
        String[] args = "[\"D\", \"D\", \"D\", \"D\", \"D\", \"D\"]".split(" ");

        Assertions.assertEquals(40, session.calculateTotal(Main.fixInput(args)), 0.01);
    }

    @Test
    public void test4_AC_D(){
        String[] args = "[\"A\", \"A\", \"D\", \"D\", \"C\", \"D\", \"C\"]".split(" ");

        Assertions.assertEquals(220, session.calculateTotal(Main.fixInput(args)), 0.01);
    }

    @Test
    public void test5_ED(){
        String[] args = "[\"A\", \"A\", \"D\", \"D\", \"C\", \"D\", \"C\", \"E\"]".split(" ");

        Assertions.assertEquals(344.5, session.calculateTotal(Main.fixInput(args)), 0.01);
    }
}