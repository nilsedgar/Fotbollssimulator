package com.nilsedgar;

public class Midfielder extends Player {

    public Midfielder(String name, int speed) {
        super(name, speed);
    }

    public boolean playerAction(){
        int rand = (int) Math.random() * 100;
        if (rand < 50) {
            System.out.println("The midfielder passes the ball to the forward.");
            return true;
        }else{
            System.out.println("The enemy defender took the ball.");
            return false;
        }

    }

}
