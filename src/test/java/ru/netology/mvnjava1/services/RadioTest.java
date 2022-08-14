package ru.netology.mvnjava1.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);

        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void switchToNextStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.next();

        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchToNextValue() {
        Radio cond = new Radio();
        cond.setCurrentStation(1);
        cond.next();

        int expected = 2;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void switchToPrevStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.prev();

        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void switchToPrevStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(4);
        cond.prev();

        int expected = 3;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);

        int expected = 10;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(8);
        cond.increaseVolume();

        int expected = 9;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeOfSound() {
        Radio cond = new Radio();

        cond.setCurrentVolume(9);
        cond.decreaseVolume();

        int expected = 8;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }







}
