package com.codecool;

public class Motorcycle extends Vehicles {

    private static  int nameNumber; // TODO show the readMe.org
    private String name;
    private int distanceTraveled;

    public Motorcycle() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }
}
