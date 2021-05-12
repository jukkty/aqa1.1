package ru.netology.service;


import org.junit.Test;


import static org.junit.Assert.assertEquals;



public class CashbackHackServiceTest {
    @Test
    public void shouldShowHowMuchExactlyRemainToBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldShowHowMuchExactlyRemainToBonus2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }
    @Test
    public void hereIsMistake() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}