package org.example;

import java.util.Scanner;
public class PlayerCount {

    public static int playerCount() {

        System.out.println("This is Snakes and Ladders. Coding and presentation by Liz and Jon");
        System.out.println("How many players? 2, 3, or 4? : ");
        for (int i = 0; i < 4; i++) {
            Scanner input = new Scanner(System.in);
            int playerCount = input.nextInt();
            if (playerCount > 1 && playerCount < 5) {
                input.close();
                System.out.println("Starting the game with " + playerCount + " players");
                return playerCount;
            }
            else {
                System.out.println("I'm sorry, that is not a valid number of players. Please try again with a number between 2 and 4: ");
                if (i == 4) {
                    System.out.println("Number of tries exceeded, closing program");
                    input.close();
                    return 0;
                }
            }
        }
        return 0;
    }
}