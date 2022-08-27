package ru.netology.mvnjava1.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetStation() {
        Radio cond = new Radio(15);

        cond.setCurrentStation(14);

        int expected = 14;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation1() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation2() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void switchToNextStation() {
        Radio cond = new Radio(15);
        cond.setCurrentStation(14);
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
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchToPrevStation() {
        Radio cond = new Radio(13);
        cond.setCurrentStation(0);
        cond.prev();

        int expected = 12;
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

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(99);

        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume101() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(99);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume100() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);
        cond.increaseVolume();

        int expected = 1;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reduceVolumeOfSound1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);
        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduceVolumeOfSound() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        cond.decreaseVolume();

        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}


