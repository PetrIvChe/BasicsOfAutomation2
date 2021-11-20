package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemain500IfAmount500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 500;
        int expected = cashbackHackService.remain(500);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRemain1IfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 1;
        int expected = cashbackHackService.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRemain0IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 0;
        int expected = cashbackHackService.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRemain0IfAmount1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 0;
        int expected = cashbackHackService.remain(1001);
        assertEquals(expected, actual);
    }
}