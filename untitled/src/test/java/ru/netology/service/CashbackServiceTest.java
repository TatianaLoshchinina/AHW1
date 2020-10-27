package ru.netology.service;

import groovy.util.GroovyTestCase;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackServiceTest extends GroovyTestCase {

    @org.testng.annotations.Test
    public void testRemain() {
    }
    CashbackService CashbackService = new CashbackService();
    @Test
    public void shouldTestRemainIfAmount0() {
        assertEquals(CashbackService.remain(0), 1000);
    }
    @Test
    public void shouldTestRemainIfAmount400() {
        assertEquals(CashbackService.remain(400), 600);
    }

    @Test
    public void shouldTestRemainIfAmount1000() {
        assertNotEquals(CashbackService.remain(1000), 0);
    }

}