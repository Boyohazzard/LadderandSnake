    package org.example;

    import java.util.ArrayList;

    import static org.example.PlayerCount.playerCount;

    public class StartingDice {
        public static ArrayList<Player> startingDice() { // maybe array, not void
            int playerCount = playerCount();
            ArrayList<Player> startingDice = new ArrayList<>();
            if (playerCount == 0) {
                System.out.print("There are no players. Game over.");
                return startingDice;
            }
            else
                for (int i = 0; i < playerCount; i++) {
                    int dice = Roll.flipDice();
                    Player player = new Player("Player" + (i + 1), dice);
                    System.out.println(player.getName() + " rolled a " + dice);
                    startingDice.add(player);
                }
                return startingDice;
        }
    }
