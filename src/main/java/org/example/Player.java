package org.example;

public class Player {
    private String name;
    private int dice;
    private int currentPosition;

    public Player(String name) {
        this.name = name;
        this.currentPosition = 0; // Players start off the board
    }

    public Player(String name, int dice) {
        this.name = name;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", currentPosition=" + currentPosition +
                '}';
    }
}