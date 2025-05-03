package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.StartingDice.startingDice;

public class PlayLadderAndSnake {

    public static void playLadderAndSnake() {
        //Create board with 100 squares
        List<Board> boardSquares = new ArrayList<Board>();
        for (int setSquareNumber = 1; setSquareNumber <= 100; setSquareNumber++) {
            boardSquares.add(new Board(setSquareNumber));
        }

        //add player method here

        Dice diceRoll = new Dice();
        for (Player player : PlayerOrder.playerOrder()) {

            while (player.getCurrentPosition() != boardSquares.size()) {


                //Player rolls the dice and moves to new location.
                player.setCurrentPosition(player.getCurrentPosition() + diceRoll.rollDice());

                //Check if the current position is >100
                while (player.getCurrentPosition() > boardSquares.size()) {
                    int overBoard = player.getCurrentPosition() - boardSquares.size();
                    player.setCurrentPosition(boardSquares.size() - overBoard);
                }

                System.out.println("The dice rolled: " + diceRoll.getRoll() + " for " + player.getName());
                System.out.println("Player " + player.getName() + " moved to square " + player.getCurrentPosition());

                Board.play(player.getCurrentPosition());
            }
        }
    }
    public static void main(String[] args) {

        playLadderAndSnake();
    }
}
