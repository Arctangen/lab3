package ru.spbstu.telematics.java;

public class Simulation {
    private Thread thread1, thread2, thread3, thread4;
    int size = 0;
    public Simulation(int i){


        TrafficLight light = new TrafficLight();
        RoadRunnable road1 = new RoadRunnable(1, light);
        RoadRunnable road2 = new RoadRunnable(2, light);
        RoadRunnable road3 = new RoadRunnable(3, light);
        RoadRunnable road4 = new RoadRunnable(4, light);
        size+=road1.add("1", i);
        size+=road2.add("2", i);
        size+=road3.add("3", i);
        size+=road4.add("4", i);
        thread1 = new Thread((Runnable) road1);
        thread2 = new Thread((Runnable) road2);
        thread3 = new Thread((Runnable) road3);
        thread4 = new Thread((Runnable) road4);
        System.out.println(size);

    }

    public void go()
    {
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }


}
