package com.nilsedgar;

public class Defender extends Player {

    public Defender(String name, int speed) {
        super(name, speed);
    }

    public void playerAction(){
        System.out.println("The defender passes the ball to the midfielder.");
    }

}
