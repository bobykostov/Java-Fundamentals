package com.company;

import java.util.Scanner;

public class pr5matrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rnc = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rnc[0]);
        int cols = Integer.parseInt(rnc[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = line[j];
            }
        }

        String com = scanner.nextLine();
        while (!"END".equals(com))
        {
            String[] parsed = com.split("\\s+");
            if (!com.contains("swap") || parsed.length != 5)
            {
                System.out.println("Invalid input!");
                com = scanner.nextLine();
                continue;
            }
            int row1 = Integer.parseInt(parsed[1]);
            int col1 = Integer.parseInt(parsed[2]);
            int row2 = Integer.parseInt(parsed[3]);
            int col2 = Integer.parseInt(parsed[4]);

            boolean row1valid = row1 < matrix.length;
            boolean row2valid = row2 < matrix.length;
            boolean col1valid = col1 < matrix[0].length;
            boolean col2valid = col2 < matrix[0].length;

            if (row1valid && row2valid && col1valid && col2valid)
            {
                String temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;

                for (String[] row : matrix) {
                    for (String col : row) {
                        System.out.print(col + " ");
                    }
                    System.out.println();
                }
            }
            else
            {
                System.out.println("Invalid input!");
            }

            com = scanner.nextLine();
        }
    }
}