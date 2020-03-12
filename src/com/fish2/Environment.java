package com.fish2;

import java.util.Random;

public class Environment {
    private Random random = new Random();
    private int temperature;

    Environment(){temperature = 20;}

    Integer getTemperature(){return temperature;}

    void changeEnvironment(){
        temperature = random.nextInt(20)+5;
    }
}