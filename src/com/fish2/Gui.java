package com.fish2;

import javax.swing.*;

public class Gui extends JFrame{

    public static void main(String[] args){
        tropicalFish tropicalFish = new tropicalFish();
        northernFish northernFish = new northernFish();
        Environment environment = new Environment();
        Gui gui = new Gui(environment, tropicalFish, northernFish);
    }
    private Gui(Environment environment, tropicalFish tropicalFish, northernFish northernFish){
        setSize(500, 250);
        setLayout(null);
        JTextArea northernFishTextArea = makeTextArea(10, 100, 80, 30, "0");
        JTextArea tropicalFishTextArea = makeTextArea(10, 50, 80, 30, "0");
        JButton northernFishButton = makeButton(100, 100, 140, 30, "add tropical fish");
        northernFishButton.addActionListener(e -> {
            northernFishTextArea.setText(northernFish.getNumber());
        });
        JButton tropicalFishButton = makeButton(100, 50, 140, 30, "add northern fish");
        tropicalFishButton.addActionListener(e -> {
            tropicalFishTextArea.setText(tropicalFish.getNumber());
        });
        JTextArea environmentArea = makeTextArea(10, 10, 200, 30,
                (environment.getTemperature()).toString());
        JButton changeButton = makeButton(250, 10, 200, 30, "change temperature");
        changeButton.addActionListener(e -> {
            environment.changeEnvironment();
            environmentArea.setText(environment.getTemperature().toString());
        });
        getContentPane().add(northernFishTextArea);
        getContentPane().add(tropicalFishTextArea);
        getContentPane().add(tropicalFishButton);
        getContentPane().add(northernFishButton);
        getContentPane().add(changeButton);
        getContentPane().add(environmentArea);
        setVisible(true);
    }

    private JTextArea makeTextArea(int x, int y, int w, int h, String text){
        JTextArea area = new JTextArea(text);
        area.setBounds(x, y, w, h);
        return area;
    }

    private JButton makeButton(int x, int y, int w, int h, String name){
        JButton button  = new JButton(name);
        button.setBounds(x, y, w, h);
        return button;
    }
}
