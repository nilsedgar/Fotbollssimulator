package com.nilsedgar;

import java.util.Random;

public class Goalie extends Player {

    public Goalie(String name, int speed) {
        super(name, speed);
    }

    public boolean playerAction() {
        int rand = (int) Math.random() * 100;
        if (rand < 90) {
            System.out.println("The Goalie passes the ball to the defender.");
            return true;
        }else{
            System.out.println("The enemy forward took the ball.");
            return false;
        }
    }
}
