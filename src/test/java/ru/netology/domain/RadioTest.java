package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStationInLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationInLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeInLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeInLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStationOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }
}

