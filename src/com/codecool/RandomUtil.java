package com.codecool;

import java.util.Random;

public class RandomUtil {

    public static int getRundomBetween(int from, int to){
        Random er = new Random();
        return er.nextInt(to-from) + from;
    }
}
