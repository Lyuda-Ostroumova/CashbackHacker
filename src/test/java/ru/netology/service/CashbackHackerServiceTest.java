package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerServiceTest {

    @Test
    void shouldTellWhatRemains() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(900);
        int expected = 100;

        assertEquals(expected, actual);

    }

    @Test
    void shouldTellWhatRemainsIfSumIs1000() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void shouldTellWhatRemainsIfSumIs0() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);

    }

    @Test
    void shouldTellWhatRemainsIfSumIs500() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(500);
        int expected = 500;

        assertEquals(expected, actual);

    }

    @Test
    void shouldTellWhatRemainsIfSumExceedsThousand() {

        CashbackHackerService cashbackService = new CashbackHackerService();

        int actual = cashbackService.remain(1400);
        int expected = 600;

        assertEquals(expected, actual);

    }


}