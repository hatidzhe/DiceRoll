package com.hatidzhe;


public class DiceThrow {

    public int die1, die2, die3;


    public DiceThrow() {

        roll();
    }


    public void roll() {

        Die d = new Die();
        Die dd = new Die();
        Die ddd = new Die();

        d.rolls();
        dd.rolls();
        ddd.rolls();

        die1 = d.getDie1();
        die2 = dd.getDie1();
        die3 = ddd.getDie1();

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
