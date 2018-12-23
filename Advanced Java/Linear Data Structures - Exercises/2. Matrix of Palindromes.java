package com.company;

import java.util.Scanner;

public class pr2matrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rnc = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rnc[0]);
        int cols = Integer.parseInt(rnc[1]);

        char one = 'a';
        char two = 'a';
        char three = 'a';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(one+""+two+""+three + " ");
                ++two;
            }
            System.out.println();
            ++one;
            ++three;
            two = one;
        }
    }
}