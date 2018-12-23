package com.company;

import java.util.Scanner;

public class pr3diagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int firstDiagSum = 0;
        for (int i = 0; i < n; i++) {
            firstDiagSum += matrix[i][i];
        }

        int secDiagSum = 0;
        int x = n - 1;
        for (int i = 0; i < n; i++) {
            secDiagSum += matrix[i][x--];
        }

        System.out.println(Math.abs(firstDiagSum - secDiagSum));
    }
}