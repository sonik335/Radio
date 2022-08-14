package ru.netology.mvnjava1.services;

public class Radio {

    public int currentVolume;
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {

            currentStation = currentStation + 1;
        }


    }


    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {

            currentStation = currentStation - 1;
        }


    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }

        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }


}