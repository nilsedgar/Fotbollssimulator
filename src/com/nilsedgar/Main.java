package com.nilsedgar;

public class Main {

    public static void main(String[] args) {

        Defender defender = new Defender("firstDefender");
        Midfielder midfielder = new Midfielder("secondMid");
        Forward forward = new Forward("thirdForward");
        Goalkeeper goalkeeper = new Goalkeeper("Goalie");


        defender.action();
        midfielder.action();
        goalkeeper.action();
        forward.action();
    }
}
