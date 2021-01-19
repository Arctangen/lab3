package ru.spbstu.telematics.java;

import java.util.LinkedList;

public class RoadRunnable extends TrafficLight implements Runnable {
    private LinkedList queue;
    private int number;
    private TrafficLight light;

    public RoadRunnable(int roadNumber, TrafficLight aLight) {
        number = roadNumber;
        light = aLight;
        queue = new LinkedList();
    }

    public void run() {
        while (!queue.isEmpty()) {
            light.turnGreen(number);
            queue.remove();
        }
    }

    public int add(String car, int limit)
    {
        for (int i = 0; i < limit; i++)
            queue.add(car);
        return queue.size();
    }
}