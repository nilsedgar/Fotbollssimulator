package com.nilsedgar;

public class Goalie extends Player {

    public Goalkeeper(String name) {
        super(name);
    }

    @Override
    public void action() {

        System.out.println("passing to defender");

    }
}
