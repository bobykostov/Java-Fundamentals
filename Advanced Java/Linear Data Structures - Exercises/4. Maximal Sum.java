package com.company;

import java.util.Scanner;

public class pr4maximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rnc = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rnc[0]);
        int cols = Integer.parseInt(rnc[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int[][] newMat = new int[3][3];

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {

                int sum = 0;
                int[][] tempMat = new int[3][3];
                int x = 0;
                int y = 0;

                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        sum += matrix[k][l];
                        tempMat[x][y++] = matrix[k][l];
                    }
                    x++;
                    y = 0;
                }

                if (sum > maxSum)
                {
                    maxSum = sum;
                    newMat = tempMat;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        for (int[] row : newMat) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}