package com.hatidzhe;


public class DiceThrow {

    public DiceThrow() {

        roll();
    }


    public void roll() {

        Die d = new Die();
        d.rolls();


    }


    public String getResult() {

        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();

        String t1 = die1.getDie1() + " " + die2.getDie1() + " " + die3.getDie1();

        return t1;

    }

}
