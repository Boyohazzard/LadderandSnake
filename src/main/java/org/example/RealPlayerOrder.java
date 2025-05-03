/*package org.example;

import java.sql.Array;
import java.util.ArrayList;

import static org.example.PlayerCount.playerCount;
import static org.example.Roll.flipDice;

public class PlayerOrder {
    public static ArrayList playerOrder() {
        int highest = 0;
        int[] tiePosition = new int[4];
        int playerCount = playerCount();
        ArrayList<Player> playerOrder = new ArrayList<>();
        if (playerCount == 0) {
            System.out.print("There are no players. Game over.");
            return playerOrder;
        }
        else
            for (int i = 0; i < playerCount; i++) {
                int dice = Roll.flipDice();
                Player player = new Player("Player" + (i + 1), dice);
                System.out.println(player.getName() + " rolled a " + dice);
                tiePosition[i] = dice;
            }
        for (int i = 0; i < tiePosition.length; i++){
            if (tiePosition[i] > highest) {
                highest = tiePosition[i];

            }

            //playerOrder.add(player);
        }
        //return playerOrder;
    }
}
*/