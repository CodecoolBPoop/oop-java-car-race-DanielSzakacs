package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class Race {

    private List<Vehicles> vehicles = new ArrayList<Vehicles>();


    protected boolean isThereABrokenTruck() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("OK");
        Race race = new Race();
        race.createVehicles();
    }

    public void createVehicles(){
        for (int i = 0; i < 10 ; i++) {
            Car car = new Car();
            Truck truck = new Truck();
            Motorcycle motorcycle = new Motorcycle();

            vehicles.add(car);
            vehicles.add(truck);
            vehicles.add(motorcycle);
        }
        System.out.println(vehicles);


    }

    public void printRaceResults(){
        // TODO call the moveForAnHour
    }
}
