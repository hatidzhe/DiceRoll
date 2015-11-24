package com.hatidzhe;


public class DiceThrow {

    public int die1, die2, die3;

    public void roll() {

        // a random number between 1 and 6
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
        die3 = (int) (Math.random() * 6) + 1;

    }

    public int getDie1() {
        // Return the number showing on the first die.
        return die1;
    }

    public int getDie2() {
        // Return the number showing on the first die.
        return die2;
    }

    public int getDie3() {
        // Return the number showing on the first die.
        return die3;
    }

    public int getTotal() {
        // Return the total showing on the two dice.
        return die1 + die2 + die3;
    }
}
