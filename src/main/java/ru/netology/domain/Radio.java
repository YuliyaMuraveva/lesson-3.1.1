package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int minStation = 0;
    private int numberStation = 10;
    private int maxStation = 9;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.maxStation = numberStation - 1;
    }

    // make getter and setter
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    // station control
    public int nextStation() {
        currentStation = currentStation < maxStation ? currentStation + 1 : minStation;
        return currentStation;
    }

    public int prevStation() {
        currentStation = currentStation > minStation ? currentStation - 1 : maxStation;
        return currentStation;
    }

    // volume control
    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return currentVolume;
    }
}
