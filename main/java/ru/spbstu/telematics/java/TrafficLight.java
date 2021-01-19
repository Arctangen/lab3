package ru.spbstu.telematics.java;

public class TrafficLight {
    private int rNumber;

    public TrafficLight() {
    }

    public void turnGreen(int roadNumber) {
        rNumber = roadNumber;
        synchronized (this) {
            System.out.print("Light turned green by road" + rNumber  + "Waiting for road" + rNumber + "car to clear intersection \n");

            System.out.print("\n \n");
        }
    }
}