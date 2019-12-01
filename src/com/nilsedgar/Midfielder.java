package com.nilsedgar;

public class Midfielder extends Player {
    public Midfielder(String name) {
        super(name);
    }

    @Override
    public void action() {

        System.out.println("shooting to left");
    }
}
