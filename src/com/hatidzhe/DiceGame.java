package com.hatidzhe;


public class DiceGame {


    public DiceGame() {
        play();
    }

    public void play() {

        DiceThrow play1 = new DiceThrow();

        play1.roll();
        System.out.println("The dice game results with " + play1.getResult());

    }


}
