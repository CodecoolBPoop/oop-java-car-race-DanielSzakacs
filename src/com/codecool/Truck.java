package com.codecool;

public class Truck extends Vehicles{

    private int breakdownTurnsLeft;

    public Truck(){
        int truckName = RandomUtil.getRundomBetween(0, 1000);
        this.name = Integer.toString(truckName);
        this.normalSpeed = 100;
    }

}
