package com.hatidzhe;


public class DiceThrow {

    int die1, die2, die3;

    public DiceThrow() {
        roll();

    }


    public void roll() {

        Die die = new Die();

        die1 = die.getTotal();
        die2 = die.getTotal();
        die3 = die.getTotal();


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
