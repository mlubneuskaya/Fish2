package com.fish2;

import java.util.Random;

public class tropicalFish implements Fish{
    private Random random = new Random();
    private int lowestTemperature;
    private int highestTemperature;
    private static Integer tropicalFishNumber = 0;

    tropicalFish(){
        lowestTemperature = 15;
        highestTemperature = 25;
    }
    @Override
    public void run() {
        tropicalFishNumber++;
    }
    @Override
    public boolean checkIfAlive(int temperature) {
        return (lowestTemperature < temperature) && (temperature < highestTemperature);
    }
    public int getHighestTemperature() {return highestTemperature;}
    public int getLowestTemperature(){return lowestTemperature;}
    public String getNumber(){return tropicalFishNumber.toString();}
}
