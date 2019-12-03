package com.nilsedgar;

public class Forward extends Player {

    public Forward(String name, int speed) {
        super(name, speed);
    }

    public void playerAction(){
        System.out.println("The forward takes a shot and scores a goal!");
    }

}
