package com.company;

import java.util.Scanner;

public class pr4seriesOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        char[] line = scan.nextLine().toCharArray();

        sb.append(line[0]);
        for (int i = 0; i < line.length-1; i++) {
            if (line[i] != line[i+1])
            {
                sb.append(line[i+1]);
            }
        }

        System.out.println(sb.toString());
    }
}