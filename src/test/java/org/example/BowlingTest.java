package org.example;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BowlingTest {


    @Test
    void gutterGameGivesZeroScore() {
            Bowling bowlingGame = new Bowling();

           for(int i = 0; i < 20; i++){
               bowlingGame.roll(0);
           }

           assertThat(bowlingGame.score()).isEqualTo(0);

    }

    @Test
    void onePinEachRollGivesScore20(){
        Bowling bowlingGame = new Bowling();

        for(int i = 0; i < 20; i++){
            bowlingGame.roll(1);
        }
        assertThat(bowlingGame.score()).isEqualTo(20);
    }

}
