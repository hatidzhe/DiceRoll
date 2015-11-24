package com.hatidzhe;

public class Die {

    private int die1;

    public Die() {
        rolls();
    }

    public void rolls() {
        // a random number between 1 and 6.
        die1 = (int) (Math.random() * 6) + 1;

    }

    public int getDie1() {
        // Return the number showing on the first die.
        return die1;
    }


    public int getTotal() {
        // Return the total showing on the two dice.
        return die1;
    }

}  // end class Dice

