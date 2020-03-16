package com.fish2;

public class northernFish implements Fish {
    private final Environment environment;
    private int lowestTemperature;
    private int highestTemperature;
    private static Integer northernFishNumber = 0;

    northernFish(Environment environment){
        this.environment = environment;
        lowestTemperature = 5;
        highestTemperature = 20;
    }
    @Override
    public void run() {
        northernFishNumber++;
        System.out.println("thread started. number of fish is "+ northernFishNumber);
        while(checkIfAlive(environment.getTemperature())){
            synchronized (environment) {
                try {
                    environment.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        northernFishNumber--;
        System.out.println("dead");
    }


    @Override
    public boolean checkIfAlive(int temperature) {
        return (lowestTemperature <= temperature) && (temperature <= highestTemperature);
    }

    public String getNumber(){return northernFishNumber.toString();}
}
