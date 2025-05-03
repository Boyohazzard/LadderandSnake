package org.example;

public class Board {

    private int squareNumber;
    private int currentPosition;

    public Board() {
    }

    public Board(int squareNumber) {
        this.squareNumber = squareNumber;
    }

    public int getSquareNumber() {
        return squareNumber;
    }

    public void setSquareNumber(int squareNumber) {
        this.squareNumber = squareNumber;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    @Override
    public String toString() {
        return "BoardSquare{" +
                "squareNumber=" + squareNumber +
                '}';
    }

    public static void play(int currentPosition) {
        if (currentPosition == 1) {
            currentPosition = 38;
            System.out.println("Player went up the ladder from 1 to " + currentPosition +
                    ".");
        } else if (currentPosition == 4) {
            currentPosition = 14;
            System.out.println("Player went up the ladder from 4 to " + currentPosition + ".");
        } else if (currentPosition == 9) {
            currentPosition = 31;
            System.out.println("Player went up the ladder from 9 to " + currentPosition + ".");
        } else if (currentPosition == 21) {
            currentPosition = 42;
            System.out.println("Player went up the ladder from 21 to " + currentPosition + ".");
        } else if (currentPosition == 28) {
            currentPosition = 84;
            System.out.println("Player went up the ladder from 28 to " + currentPosition + ".");
        } else if (currentPosition == 36) {
            currentPosition = 44;
            System.out.println("Player went up the ladder from 36 to " + currentPosition + ".");
        } else if (currentPosition == 51) {
            currentPosition = 67;
            System.out.println("Player went up the ladder from 51 to " + currentPosition + ".");
        } else if (currentPosition == 71) {
            currentPosition = 91;
            System.out.println("Player went up the ladder from 71 to " + currentPosition + ".");
        } else if (currentPosition == 80) {
            currentPosition = 100;
            System.out.println("Player went up the ladder from 80 to " + currentPosition + ".");
        }

        //Snake logic for board square numbers 16(6), 48(30), 62(19), 64(60), 93(68), 95(24), 97
        // (76), 98(78)
        else if (currentPosition == 16) {
            currentPosition = 6;
            System.out.println("Player went down the snake from 16 to " + currentPosition + ".");
        } else if (currentPosition == 48) {
            currentPosition = 30;
            System.out.println("Player went down the snake from 48 to " + currentPosition + ".");
        } else if (currentPosition == 62) {
            currentPosition = 19;
            System.out.println("Player went down the snake from 62 to " + currentPosition + ".");
        } else if (currentPosition == 64) {
            currentPosition = 60;
            System.out.println("Player went down the snake from 64 to " + currentPosition + ".");
        } else if (currentPosition == 93) {
            currentPosition = 68;
            System.out.println("Player went down the snake from 93 to " + currentPosition + ".");
        } else if (currentPosition == 95) {
            currentPosition = 24;
            System.out.println("Player went down the snake from 95 to " + currentPosition + ".");
        } else if (currentPosition == 97) {
            currentPosition = 76;
            System.out.println("Player went down the snake from 97 to " + currentPosition + ".");
        } else if (currentPosition == 98) {
            currentPosition = 78;
            System.out.println("Player went down the snake from 98 to " + currentPosition + ".");
        } else System.out.print("");

    }
}
