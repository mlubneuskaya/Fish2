package com.fish2;

import javax.swing.*;

public class Gui extends JFrame{

    public static void main(String[] args){
        Environment environment = new Environment();
        Gui gui = new Gui(environment);
    }
    private Gui(Environment environment){
        setSize(500, 250);
        setLayout(null);
        JTextArea coldFishTextArea = makeTextArea(10, 100, 80, 30, "");
        JTextArea warmFishTextArea = makeTextArea(10, 50, 80, 30, "");
        JButton coldFishButton = makeButton(100, 100, 80, 30, "add");
        JButton warmFishButton = makeButton(100, 50, 80, 30, "add");
        JTextArea environmentArea = makeTextArea(10, 10, 200, 30,
                (environment.getTemperature()).toString());
        JButton changeButton = makeButton(250, 10, 200, 30, "change temperature");
        changeButton.addActionListener(e -> {
            environment.changeEnvironment();
            environmentArea.setText(environment.getTemperature().toString());
        });
        getContentPane().add(coldFishTextArea);
        getContentPane().add(warmFishTextArea);
        getContentPane().add(warmFishButton);
        getContentPane().add(coldFishButton);
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
