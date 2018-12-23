package com.company;

import java.util.Scanner;

public class pr11gameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String winnername = "";
        int winnerscore = Integer.MIN_VALUE;

        int count = 0;
        while (count < n)
        {
            String name = scanner.nextLine();
            int score = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < name.length(); i++) {
                if (Character.codePointAt(name,i) % 2 == 0)
                {
                    score += Character.codePointAt(name,i);
                }
                else
                {
                    score -= Character.codePointAt(name,i);
                }
            }

            if (score > winnerscore)
            {
                winnerscore = score;
                winnername = name;
            }

            ++count;
        }

        System.out.printf("The winner is %s - %d points", winnername, winnerscore);
    }
}