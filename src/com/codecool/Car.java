package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;

public class Car extends Vehicles{
    private static ArrayList<String> autoName = new ArrayList <>(Arrays.asList ("Magic", "Prody", "Storm", "Blaze", "Bolt", "Vanish", "Fang", "Pinnacle", "Dominion", "Catalyst", "Falcon", "Temperament", "Dragon", "Radiance", "Quest", "Parallel", "Shadow", "Parallel", "Ranger", "Adventure"));



    public void moveForAnHour(){
        // TODO Ask the mentor, (What to do with this) MIvel ez mindenhol ugyan olyan lehetne a Race-ben implementálni.
        distanceTraveled += normalSpeed;
    }

    public Car(){
        int firstIndex = RandomUtil.getRundomBetween(0, autoName.size());
        int secondIndex = RandomUtil.getRundomBetween(0, autoName.size());
        this.name = autoName.get(firstIndex) + " " + autoName.get(secondIndex);
    }
}
