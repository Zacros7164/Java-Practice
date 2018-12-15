package com.zaccrosby;

import java.sql.SQLOutput;

public abstract class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 900;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int joeScore = calculateHighScorePosition(1000);
        int frankScore = calculateHighScorePosition(500);
        int bobScore = calculateHighScorePosition(400);
        int mattScore = calculateHighScorePosition(50);

        displayHighScorePosition("Joe", joeScore);
        displayHighScorePosition( "Frank", frankScore);
        displayHighScorePosition("Bob", bobScore);
        displayHighScorePosition("Matt", mattScore);



    }

    public static int calculateScore(boolean gameStatus, int score, int levelCompleted, int bonus) {

        if(gameStatus) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }else {
            return -1;
        }
    }





    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " made it into position " + position + " on the high score board!");

    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000){
//            return 1;
//        } else if(score >= 500){
//            return 2;
//        } else if(score >= 100){
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4;
        
        if(score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }




}
