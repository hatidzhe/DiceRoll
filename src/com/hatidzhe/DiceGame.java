package com.hatidzhe;


public class DiceGame {

    public int die1, die2, die3;

    public DiceGame() {
        play();
    }

    public void play() {

        DiceThrow play1 = new DiceThrow();
        DiceThrow play2 = new DiceThrow();
        DiceThrow play3 = new DiceThrow();

        play1.roll();

        die1 = play1.getDie1();
        die2 = play1.getDie2();
        die3 = play1.getDie3();

        die1 = play2.getDie1();
        die2 = play2.getDie2();
        die3 = play2.getDie3();

        die1 = play3.getDie1();
        die2 = play3.getDie2();
        die3 = play3.getDie3();

    }

    public int getDie1() {

        // Return the number showing on the first die.
        return die1;
    }

    public int getDie2() {


        return die2;
    }

    public int getDie3() {


        return die3;
    }

}
