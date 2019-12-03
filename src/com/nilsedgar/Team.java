package com.nilsedgar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team {

    private String name;

    ArrayList<Player> players = new ArrayList<>();


    public Team(String name) {

        players.add(new Goalie("Goalie", 100));
        players.add(new Defender("Defender", 100));
        players.add(new Midfielder("Midfielder", 100));
        players.add(new Forward("Forward", 100));

        this.name = name;
    }

}
