package ru.netology.service;


import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;



public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    void shouldShowHowMuchExactlyRemainToBonus() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
    @Test
    void shouldShowHowMuchExactlyRemainToBonus2() {
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }
    @Test
    void hereIsMistake() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}