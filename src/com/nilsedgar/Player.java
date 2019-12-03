package com.nilsedgar;

public abstract class Player {

    private String name;
    private int speed;

    public Player(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }


    public abstract void playerAction();

}
