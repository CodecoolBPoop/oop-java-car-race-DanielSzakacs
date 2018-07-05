package com.codecool;

public class Car extends Vehicles{
    private int normalSpeed;
    private String name;
    private int distanceTraveled;

    public void moveForAnHour(){
        // TODO Ask the mentor, (What to do with this) MIvel ez mindenhol ugyan olyan lehetne a Race-ben implementálni.
        distanceTraveled += normalSpeed;
    }

    public Car(){
    }

    // getter setter Name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    // speed
    public void setSpeed(int speed) {
        this.normalSpeed = speed;
    }
    public int getDistanceTraveled(){
        return this.distanceTraveled;
    }

}
