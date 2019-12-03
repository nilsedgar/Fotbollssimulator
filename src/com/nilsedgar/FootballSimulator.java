package com.nilsedgar;

import java.util.ArrayList;
import java.util.Scanner;

public class FootballSimulator {

    int gameTime = 0;
    Team team = new Team("Madrid");

    public FootballSimulator() {

    }

    public void showMainMenu() {
        boolean continueToRun = true;

        System.out.println("Welcome. Be prepared for a hyper-realistic simulation of a football-soccerball-game-match!");

        while (continueToRun) {
            System.out.println("Make your decision wisely: ");
            System.out.println("1. Choose team");
            System.out.println("2. Start match");
            System.out.println("3. View statistics");
            System.out.println("4. Wisely");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    match();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    continueToRun = false;
            }
        }
    }

    public void match() {
        gameTime = 0;
        int score = 0;

        while (gameTime < 90) {
            doPlayerAction(team.players.get(0));

            doPlayerAction(team.players.get(1));

            doPlayerAction(team.players.get(2));

            doPlayerAction(team.players.get(3));
            score++;
        }
        System.out.println("The end score: " + score);
        System.out.println("Runtime: " + gameTime);

    }

    private void doPlayerAction(Player player){
        player.playerAction();
        gameTime++;
        System.out.println("Time passed: " + gameTime);
    }

    public void match2(Team team) {


    }

}

