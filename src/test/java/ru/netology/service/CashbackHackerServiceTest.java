package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackerServiceTest {

    @Test
    public void shouldTellWhatRemains() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldTellWhatRemainsIfSumIs1000() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldTellWhatRemainsIfSumIs0() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldTellWhatRemainsIfSumIs500() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(500);
        int expected = 500;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldTellWhatRemainsIfSumExceedsThousand() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(1400);
        int expected = 600;

        Assert.assertEquals(actual, expected);

    }


}