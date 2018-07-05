package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;

public class Car extends Vehicles{
    private static ArrayList<String> autoName = new ArrayList <>(Arrays.asList ("Magic", "Prody", "Storm", "Blaze", "Bolt", "Vanish", "Fang", "Pinnacle", "Dominion", "Catalyst", "Falcon", "Temperament", "Dragon", "Radiance", "Quest", "Parallel", "Shadow", "Parallel", "Ranger", "Adventure"));

    public Car(){
        int firstIndex = RandomUtil.getRundomBetween(0, autoName.size());
        int secondIndex = RandomUtil.getRundomBetween(0, autoName.size());
        this.name = autoName.get(firstIndex) + " " + autoName.get(secondIndex);
        this.normalSpeed = RandomUtil.getRundomBetween(80, 110);
    }
}
