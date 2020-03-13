package com.fish2;

import java.util.Random;

public class tropicalFish implements Fish{
    private Random random = new Random();
    private int lowestTemperature;
    private int highestTemperature;

    tropicalFish(){
        lowestTemperature = 15;
        highestTemperature = 25;
    }
    @Override
    public void run() {}
    @Override
    public boolean checkIfAlive(int temperature) {
        return (lowestTemperature < temperature) && (temperature < highestTemperature);
    }
    public int getHighestTemperature() {return highestTemperature;}
    public int getLowestTemperature(){return lowestTemperature;}
}
