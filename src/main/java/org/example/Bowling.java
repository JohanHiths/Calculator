package org.example;

public class Bowling {
    private int[] rolls = new int[20];
    private int rollCount = 0;
    private int score = 0;


    public void roll(int pins){
        rolls[rollCount++] = pins;
    }
    public int score(){
        for (int i = 0; i < rolls.length; i++) {
           if(rolls[i] + rolls[i+1] == 10){
               score += 10 + rolls[i+2];
               score += rolls[i];
               score += rolls[i+1];
           }

        }
        return score;
    }

}
