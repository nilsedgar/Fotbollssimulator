package com.nilsedgar;

public class Midfielder extends Player {

    public Midfielder(String name, int speed) {
        super(name, speed);
    }

    public void playerAction(){
        System.out.println("The midfielder passes the ball to the forward.");
    }

}
