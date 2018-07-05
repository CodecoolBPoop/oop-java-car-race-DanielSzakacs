package com.codecool;

public class Weather {

    private static boolean isRaining;


    static void setRaining(){
        int chanceOfRain = RandomUtil.getRundomBetween(0, 100);
        if (chanceOfRain > 30){
            isRaining = false;
        }else{
            isRaining = true;
        }
    }

    public static boolean isIsRaining() {
        return isRaining;
    }
}
