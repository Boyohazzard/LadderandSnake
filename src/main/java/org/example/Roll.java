package org.example;

public class Roll {

    public static int flipDice() {
        int roll = (int) (1 + Math.random() * 6);
        return roll;
    }
}
