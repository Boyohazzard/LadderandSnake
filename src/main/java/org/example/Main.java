package org.example;
import java.util.Scanner;
import static org.example.LadderAndSnake.flipDice;

public class Main {
    public static void main(String[] args) {

        new LadderAndSnake();

        System.out.println("This is Snakes and Ladders. Coding and presentation by Liz and Jon");
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose 2, 3, or 4 for the number of players who will be playing: ");
        for (int i = 0; i < 4; i++) {
            int playerCount = input.nextInt();
            if (input.nextInt() > 1 && input.nextInt() < 5) {
                break;
            }
            System.out.println("I'm sorry, that is not a valid number of players. Please try again between 2 and 4: ");
        }
        System.out.println("Number of tries exceeded, closing program");
        //something to end main? Also need to skip this if a correct number is used. right now break leads here!

        input.close();

        //Actually run game with playerCount passed to driver() maybe?

        System.out.println("This concludes the game. Thank you for playing!");
        for (int i = 0; i < 50; i++)
            System.out.println(flipDice());

    }
}

//System.out.println(""); just here to copy past for now