package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerServiceTest {

    @Test
    public void shouldTellWhatRemains() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldTellWhatRemainsIfSumIs1000() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldTellWhatRemainsIfSumIs0() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(0);
        int expected = 1000;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldTellWhatRemainsIfSumIs500() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(500);
        int expected = 500;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldTellWhatRemainsIfSumExceedsThousand() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(1400);
        int expected = 600;

        Assert.assertEquals(expected, actual);

    }


}