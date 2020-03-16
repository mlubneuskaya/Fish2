package com.fish2;

public class tropicalFish implements Fish{
    private final Environment environment;
    private int lowestTemperature;
    private int highestTemperature;
    private static Integer tropicalFishNumber = 0;

    tropicalFish(Environment environment){
        this.environment = environment;
        lowestTemperature = 15;
        highestTemperature = 25;
    }
    @Override
    public void run() {
        tropicalFishNumber++;
        while(checkIfAlive(environment.getTemperature())){
            synchronized (environment) {
                try {
                    environment.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        tropicalFishNumber--;
    }

    @Override
    public boolean checkIfAlive(int temperature) {
        return (lowestTemperature < temperature) && (temperature < highestTemperature);
    }

    String getNumber(){return tropicalFishNumber.toString();}
}
