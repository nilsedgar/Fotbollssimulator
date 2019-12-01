package com.nilsedgar;

public class Defender extends Player {
    private boolean shootingToLeft;
    private boolean shootingToRight;
    private boolean gameInProgress = false;


    public Defender(String name) {
        super(name);
    }

    public void action() {
        double coinToss = Math.random();
        if (coinToss <= 0.4) {
            shootingToLeft = true;
            System.out.println("shooting to left side");
            gameInProgress = true;
        } else if (coinToss >= 0.6) {
            shootingToRight = true;
            System.out.println("shooting to right side");
            gameInProgress = true;
        } else {
            System.out.println("shooting straight");
        }
    }
}
