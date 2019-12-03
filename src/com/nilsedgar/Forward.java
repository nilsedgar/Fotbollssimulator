package com.nilsedgar;

public class Forward extends Player {

    public Forward(String name, int speed) {
        super(name, speed);
    }

    public boolean playerAction(){
        int rand = (int) Math.random() * 100;
        if (rand < 20) {
            System.out.println("The forward scores a goal");
            return true;
        }else{
            System.out.println("The enemy goalie made a save.");
            return false;
        }
    }

}
