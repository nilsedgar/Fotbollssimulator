package com.nilsedgar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team {

    private String name;

    ArrayList<Player> players = new ArrayList<>();


    public Team(String name) {
        players.add(0, new Goalie("goalie", 1));
        players.add(1, new Defender("def", 1));
        players.add(2, new Midfielder("mid", 1));
        players.add(3, new Forward("forw", 1));
        this.name = name;
    }

}
