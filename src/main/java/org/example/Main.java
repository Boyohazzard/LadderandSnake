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
            if (input.nextInt() > 1 && input.nextInt() < 5) {
                int playerCount = input.nextInt();
                break;
        }
    }




        input.close();

        System.out.println("This concludes the game. Thank you for playing!");
        for (int i = 0; i < 50; i++)
            System.out.println(flipDice());

    }
}

//System.out.println("");