package com.nilsedgar;

public class Goalie extends Player {

    public Goalie(String name, int speed) {
        super(name, speed);
    }

    public void playerAction(){
        System.out.println("The Goalie passes the ball to the defender.");
    }
}
