package com.hatidzhe;

public class Main {


    public static void main(String[] args) {


        Die d = new Die();
        d.rolls();
        System.out.println("The die comes up " + d.getDie1());


        DiceThrow die1 = new DiceThrow();
        DiceThrow die2 = new DiceThrow();
        DiceThrow die3 = new DiceThrow();
        die1.roll();
        System.out.println("The dice come up " + die1.getDie1() + " " + die2.getDie2() + " " + die3.getDie3());


        DiceGame play1 = new DiceGame();
        DiceGame play2 = new DiceGame();
        DiceGame play3 = new DiceGame();
        play1.play();
        play2.play();
        play3.play();
        System.out.println("The dice play number one returns " + play1.getDie1() + " " + play1.getDie2() + " " + play1.getDie3());
        System.out.println("The dice play number two returns " + play2.getDie1() + " " + play2.getDie2() + " " + play2.getDie3());
        System.out.println("The dice play number three returns " + play3.getDie1() + " " + play3.getDie2() + " " + play3.getDie3());


    }

}

