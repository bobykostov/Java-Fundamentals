package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class pr8handsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> playerHands = new HashMap<>();
        LinkedHashMap<String, Integer> scoreboard = new LinkedHashMap<>();

        int s = 4, h = 3, d = 2, c = 1;
        int j = 11, q = 12, k = 13, a = 14;
        String line = scan.nextLine();

        while (!"JOKER".equals(line))
        {
            String[] player = line.split(": ");
            String name = player[0];
            String[] hand = player[1].split(", ");
            ArrayList<String> noDupes = new ArrayList<>();

            for (String card : hand) {
                if (noDupes.isEmpty() || !noDupes.contains(card))
                {
                    noDupes.add(card);
                }
            }

            int score = 0;

            for (String card : noDupes) {
                if (Character.isDigit(card.charAt(0)))
                {
                    int power = Integer.parseInt(card.length() > 2 ? card.substring(0,2) : Character.toString(card.charAt(0)));

                    switch (card.length() > 2 ? card.charAt(2) : card.charAt(1))
                    {
                        case 'S': score+=power*s; break;
                        case 'H': score+=power*h; break;
                        case 'D': score+=power*d; break;
                        case 'C': score+=power*c; break;
                    }
                }
                else
                {
                    int power = 0;
                    int type = 0;
                    switch (card.charAt(0))
                    {
                        case 'J': power = j; break;
                        case 'Q': power = q; break;
                        case 'K': power = k; break;
                        case 'A': power = a; break;
                    }
                    switch (card.charAt(1))
                    {
                        case 'S': type = s; break;
                        case 'H': type = h; break;
                        case 'D': type = d; break;
                        case 'C': type = c; break;
                    }
                    score += power*type;
                }
            }

            if (scoreboard.isEmpty() || !scoreboard.containsKey(name))
                scoreboard.put(name, score);
            else
                scoreboard.put(name, scoreboard.get(name) + score);

            line = scan.nextLine();
        }

        for (String player : scoreboard.keySet()) {
            System.out.println(player + ": " + scoreboard.get(player));
        }
    }
}