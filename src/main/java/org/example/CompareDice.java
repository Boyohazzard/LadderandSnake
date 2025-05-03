package org.example;

import java.util.Comparator;

public class CompareDice implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        return a.getDice() < b.getDice() ? 1 : a.getDice() == b.getDice() ? 0 : -1;
    }
}