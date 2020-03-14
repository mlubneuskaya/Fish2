package com.fish2;
import java.util.Random;

public class northernFish implements Fish {
    private Random random = new Random();
    private int lowestTemperature;
    private int highestTemperature;
    private static Integer northernFishNumber = 0;

    northernFish(){
        lowestTemperature = 5;
        highestTemperature = 20;
    }
    @Override
    public void run() {
        northernFishNumber++;
    }
    @Override
    public boolean checkIfAlive(int temperature) {
        return (lowestTemperature < temperature) && (temperature < highestTemperature);
    }
    public int getHighestTemperature() {return highestTemperature;}
    public int getLowestTemperature(){return lowestTemperature;}
    public String getNumber(){return northernFishNumber.toString();}
}
