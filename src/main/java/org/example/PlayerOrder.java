package org.example;

import java.util.ArrayList;
import java.util.Collections;
import static org.example.PlayerCount.playerCount;

public class PlayerOrder {

    public static ArrayList<Player> playerOrder() {
        int playerCount = playerCount();
        ArrayList<Player> playerOrder = new ArrayList<>();
        if (playerCount == 0) {
            System.out.print("There are no players. Game over.");
            return playerOrder;
        }
        else {
            for (int i = 0; i < playerCount; i++) {
                int dice = Roll.flipDice();
                Player player = new Player("Player" + (i + 1), dice);
                System.out.println(player.getName() + " rolled a " + dice);
                playerOrder.add(player);
            }
        }
        Collections.sort(playerOrder, new CompareDice());

        for (Player player : playerOrder) {
            System.out.println(player.getName());
        }
        return playerOrder;
    }
}
