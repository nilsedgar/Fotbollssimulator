package com.nilsedgar;

public class Forward extends Player {
    private boolean shootingStraight;
    private boolean Goal;
    private boolean shootingStraightToGoalie;
    private boolean gameInProgress = false;


    public Forward(String name) {
        super(name);
    }

    @Override
    public void action() {

        double coinToss = Math.random();
        if (coinToss <= 0.3) {
            shootingStraight = true;
            System.out.println("shooting stright to port side");
            gameInProgress = true;
        } else if (coinToss >= 0.3 && coinToss<=0.6) {
            shootingStraightToGoalie = true;
            System.out.println("shooting straight to goalie side");
            gameInProgress = true;
        } else if (coinToss > 0.6) {
            System.out.println("Goal !!!!!!");
        } else {
            System.out.println("shooting to right");
        }

    }
}
