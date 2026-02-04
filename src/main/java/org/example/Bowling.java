package org.example;

public class Bowling {
    private int[] rolls = new int[20];
    private int rollCount = 0;



    public void roll(int pins){
        if (pins == 10)
            rollCount++;
        rolls[rollCount++] = pins;
    }

    private boolean isFinalFrame(){
        return rollCount > 18;
    }
    public int score(){
        int score = 0;
        for (int i = 0; i < rolls.length; i+=2) {
          if(isStrike(i))
              score += strikeBonus(i);
          else if(isSpare(i)){
              score += rolls[i] + rolls[i + 1] + spareBonus(i);
          } else
              score += rolls[i] + rolls[i + 1];

          }
        return score;
           }

    private int spareBonus(int i){
        return rolls[i + 2];
    }

    private int strikeBonus(int i){
        if (i == 16)
            return rolls[i+1] + rolls[i+2];
        if(rolls[i + 2] == 10)
            return rolls[i + 2] + rolls[i + 4];
        return rolls[i + 2] + rolls[i + 3];
    }

    public boolean isStrike(int i){
        return rolls[i] == 10;

    }

    public boolean isSpare(int i){

        return rolls[i] == 0 && rolls[i + 1] == 10;
    }
}
