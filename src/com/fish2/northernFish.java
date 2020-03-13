package com.fish2;
import java.util.Random;

public class northernFish implements Fish {
    private Random random = new Random();
    private int lowestTemperature;
    private int highestTemperature;

    northernFish(){
        lowestTemperature = 5;
        highestTemperature = 20;
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
