package com.company;

import java.util.Scanner;

public class pr1fillTheMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stuff = scanner.nextLine().split(", ");
        int n = Integer.parseInt(stuff[0]);

        int[][] matrix = new int[n][n];

        if ("A".equals(stuff[1]))
            matrix = fillA(n, matrix);
        else if ("B".equals(stuff[1]))
        {
            matrix = fillB(n, matrix);
        }

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillA(int n, int[][] matrix) {
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = ++num;
            }
        }

        return matrix;
    }

    private static int[][] fillB(int n, int[][] matrix) {
        boolean goUp = true;
        int num = 0;

        for (int i = 0; i < n; i++) {
            if (!goUp)
            {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[j][i] = ++num;
                }

                goUp = true;
            }
            else
            {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = ++num;
                }

                goUp = false;
            }
        }

        return matrix;
    }
}