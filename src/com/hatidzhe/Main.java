package com.hatidzhe;

public class Main {


    public static void main(String[] args) {


        Die dice = new Die();
        dice.rolls();
        System.out.println("The die comes up " + dice.getDie1());

        DiceThrow die1 = new DiceThrow();
        DiceThrow die2 = new DiceThrow();
        DiceThrow die3 = new DiceThrow();
        die1.roll();
        die2.roll();
        die3.roll();
        System.out.println("The dice come up " + die1.getDie1() + " " + die2.getDie2() + " " + die3.getDie3());
    }

}

