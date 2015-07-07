package com.hatidzhe;
import java.util.Random;
/**
 * Created by hatidzhe on 15-6-15.
 */
public class Dice {
    private int die1;
    private int die2;
    public Dice() {
        roll();
    }
    public void roll() {
        // a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
    }

    public int getDie1() {
        // Return the number showing on the first die.
        return die1;
    }

    public int getDie2() {
        // Return the number showing on the second die.
        return die2;
    }

    public int getTotal() {
        // Return the total showing on the two dice.
        return die1 + die2;
    }

}  // end class Dice

