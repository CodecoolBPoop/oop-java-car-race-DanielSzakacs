package com.codecool;

public class Motorcycle extends Vehicles {

    private String[] motorcycleName = {"Motorcycle"};

    public Motorcycle(int number) {
        this.name = motorcycleName[0] + " " + number;
        if(Weather.isIsRaining()){
            this.normalSpeed = RandomUtil.getRundomBetween(5, 50);
        }else{
            this.normalSpeed = 100 ;
        }
    }
}
