package ru.spbstu.telematics.java;

public class TrafficLight {

    private String route;
    private int nextCar;
    private CS collision;

    public TrafficLight(String route, int nextCar, CS collision) {
        this.route = route;
        this.nextCar = nextCar;
        this.collision = collision;
    }

    public synchronized void start(int id) {
        while (id != nextCar) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (route == "SN") {
            runSN(id);
        }
        if (route == "NS") {
            runNS(id);
        }
        if (route == "WE") {
            runWE(id);
        }

        if (route == "ES") {
            runES(id);
        }
        nextCar++;
        notifyAll();

    }

    public String getRoute() {
        return route;
    }

    public synchronized void runSN(int id) {
        while (collision.getCollision(3) == 1) {

        }
        collision.setSN_WE();
        collision.freeSN_WE();
        collision.setES_SN();
        collision.freeES_SN();

    }

    public synchronized void runNS(int id) {
        while (collision.getCollision(4) == 1) {
        }
        collision.setNS_WE();
        collision.freeNS_WE();
    }

    public synchronized void runWE(int id) {
        collision.setNS_WE();
        collision.freeNS_WE();
        collision.setES_WE();
        collision.freeES_WE();
        collision.setSN_WE();
        collision.freeSN_WE();
    }

    public synchronized void runES(int id) {
        while (collision.getCollision(2) == 1) {

        }
        collision.setES_SN();
        collision.freeES_SN();
        collision.setES_WE();
        collision.freeES_WE();
    }
}