package ru.spbstu.telematics.java;

public class Car implements Runnable {

    private TrafficLight tL;
    private int id;

    Car(TrafficLight tL, int id) {
        this.tL = tL;
        this.id = id;
    }

    public void run() {
        long sleepTime = 1000;
        System.out.println(tL.getRoute() + " #" + id + " came to a crossroads");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tL.start(id);
        System.out.println(tL.getRoute() + " #" + id
                + " departed form crossroads");

    }
}