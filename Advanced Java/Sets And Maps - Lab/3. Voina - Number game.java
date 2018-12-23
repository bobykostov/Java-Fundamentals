package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class pr3voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>();

        fillNumbers(scanner, firstPlayer, secondPlayer);

        for (int i = 0; i < 50; i++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty())
            {
                System.out.println(firstPlayer.isEmpty() ? "Second player win!" : "First player win!");
                return;
            }

            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);

            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber){
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            }
            else if (secondNumber > firstNumber)
            {
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }
        }

        if (firstPlayer.size() > secondPlayer.size())
            System.out.println("First player win!");
        else if (firstPlayer.size() < secondPlayer.size())
            System.out.println("Second player win!");
        else
            System.out.println("Draw!");
    }

    private static void fillNumbers(Scanner scanner, LinkedHashSet<Integer> firstPlayer, LinkedHashSet<Integer> secondPlayer) {
        String[] firPlNums = scanner.nextLine().split("\\s+");
        String[] secPlNums = scanner.nextLine().split("\\s+");

        for (String firPlNum : firPlNums) {
            firstPlayer.add(Integer.parseInt(firPlNum));
        }

        for (String secPlNum : secPlNums) {
            secondPlayer.add(Integer.parseInt(secPlNum));
        }
    }
}