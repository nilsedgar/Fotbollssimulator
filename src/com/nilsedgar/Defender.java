package com.nilsedgar;

public class Defender extends Player {

    public Defender(String name, int speed) {
        super(name, speed);
    }

    public boolean playerAction() {
        int rand = (int) Math.random() * 100;
        if (rand < 70) {
            System.out.println("The defender passes the ball to the midfielder.");
            return true;
        }else{
            System.out.println("The enemy midfielder took the ball.");
            return false;
        }

    }


}
