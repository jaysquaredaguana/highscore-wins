package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Please enter the game score: ");
        String gameScore = read.nextLine().trim();

        // Split into team names and scores
        String[] gameInfo = gameScore.split("\\|");

        // Split the team names
        String[] teams = gameInfo[0].split(":");

        // Split the scores
        String[] scores = gameInfo[1].split(":");

        // Convert scores from String to int
        int firstScore = Integer.parseInt(scores[0]);
        int secondScore = Integer.parseInt(scores[1]);

        // Determine the winner
        if (firstScore > secondScore) {
            System.out.println("Winner: " + teams[0]);
        } else if (secondScore > firstScore) {
            System.out.println("Winner: " + teams[1]);
        } else {
            System.out.println("Winner: Tie!");
        }

        read.close();
    }
}
