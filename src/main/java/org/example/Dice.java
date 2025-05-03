package org.example;
public class Dice {
    private int roll;

    public Dice() {
    }

    public int rollDice() {
        this.roll = (int) (1 + Math.random() * 6);
        return this.roll;
    }

    public int getRoll() {
        return roll;
    }

    //No setter as you don't need to set the value, it should be gotten from the roll.
}