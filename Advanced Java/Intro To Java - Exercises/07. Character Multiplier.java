package com.company;

import java.util.Scanner;

public class pr7charMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next("\\w+");
        String second = scanner.next("\\w+");

        int sum = 0;
        if (first.length() == second.length())
        {
            for (int i = 0; i < first.length(); i++)
            {
                sum += first.charAt(i)*second.charAt(i);
            }
        }
        else
        {
            for (int i = 0; i < Math.min(first.length(),second.length()); i++)
            {
                sum += first.charAt(i)*second.charAt(i);
            }

            for (int i = Math.min(first.length(),second.length()); i < Math.max(first.length(),second.length()); i++)
            {
                if (first.length() > second.length())
                {
                    sum += first.charAt(i);
                }
                else
                {
                    sum += second.charAt(i);
                }
            }
        }

        System.out.println(sum);
    }
}