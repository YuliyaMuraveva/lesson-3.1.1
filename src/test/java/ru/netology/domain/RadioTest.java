package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio(15);

    @Test
    public void setCurrentStation() {
        int expected = 14;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationOutLimit() {
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolume() {
        int expected = 90;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOutLimit() {
        radio.setCurrentVolume(110);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStationInLimit() {
        radio.setCurrentStation(13);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationInLimit() {
        radio.setCurrentStation(10);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        radio.setCurrentStation(14);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMin() {
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeInLimit() {
        radio.setCurrentVolume(50);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeInLimit() {
        radio.setCurrentVolume(50);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        radio.setCurrentVolume(100);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        radio.setCurrentVolume(0);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStationOutLimit() {
        radio.setCurrentStation(16);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationOutLimit() {
        radio.setCurrentStation(-1);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeOutLimit() {
        radio.setCurrentVolume(110);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeOutLimit() {
        radio.setCurrentVolume(-1);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }
}
