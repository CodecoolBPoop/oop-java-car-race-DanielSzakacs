package com.codecool;

public class Vehicles {
    protected int normalSpeed;
    protected String name;
    protected int distanceTraveled;



    public int getNormalSpeed() {
        return normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void moveForAnHour(){
        distanceTraveled += normalSpeed;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "normalSpeed=" + normalSpeed +
                ", name='" + name + '\'' +
                ", distanceTraveled=" + distanceTraveled +
                '}';
    }
}
