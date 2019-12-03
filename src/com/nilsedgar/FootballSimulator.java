package com.nilsedgar;

import java.util.ArrayList;
import java.util.Scanner;

public class FootballSimulator {

    ArrayList<Team> teams = new ArrayList<>();

    public void showMainMenu(){
        boolean continueToRun = true;

        System.out.println("Welcome. Be prepared for a hyper-realistic simulation of a football-soccerball-game-match!");

        while(continueToRun){
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

    public void match(){

        Goalie goalie = new Goalie("goalie", 100);
        Defender defender = new Defender("defender", 100);
        Midfielder midfielder = new Midfielder("Mid", 100);
        Forward forward = new Forward("Forward", 100);
        int gameTime = 0;
        int score = 0;

            while(gameTime < 90){
            goalie.playerAction();
            gameTime++;
            System.out.println("Time passed: " + gameTime);
            defender.playerAction();
            gameTime++;
                System.out.println("Time passed: " + gameTime);
            midfielder.playerAction();
            gameTime++;
                System.out.println("Time passed: " + gameTime);
            forward.playerAction();
            gameTime += 3;
            score++;
                System.out.println("Time passed: " + gameTime);
        }
        System.out.println("The end score: " + score);
        System.out.println("Runtime: " + gameTime);

    }

    public void coinflip(){
        int coinflipResult = (int)Math.round(Math.random());
    }

}
