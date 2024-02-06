package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void calculateCashBack1 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void calculateCashBack2 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void calculateCashBack3 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1010;

        int actual = service.remain(amount);
        int expected = 990;

        Assert.assertEquals(actual, expected);
    }
}
