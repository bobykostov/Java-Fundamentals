package com.company;

import java.util.Scanner;

public class pr6hitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == n)
                {
                    System.out.printf("%d + %d = %d%n", i,j,n);
                }
            }
        }

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i - j == n)
                {
                    System.out.printf("%d - %d = %d%n", i,j,n);
                }
            }
        }
    }
}