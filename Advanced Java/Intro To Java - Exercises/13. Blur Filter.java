package com.company;

import java.util.Scanner;

public class pr13blurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int blurAmount = Integer.parseInt(scanner.nextLine());
        String[] rNc = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rNc[0]);
        int cols = Integer.parseInt(rNc[1]);

        long[][] matrix = new long[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        String[] coordinates = scanner.nextLine().split(" ");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == x || i == x - 1 || i == x + 1) &&
                        (j == y || j == y - 1 || j == y + 1))
                {
                    matrix[i][j] += blurAmount;
                }
            }
        }

        for (long[] row : matrix) {
            for (long col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}