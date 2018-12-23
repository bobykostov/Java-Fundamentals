package com.company;

import java.util.Scanner;

public class pr1countSubstringOcurrences {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        String key = scan.nextLine();
        int count = 0;

        for (int i = 0; i <= line.length()-key.length(); i++) {
            if (line.substring(i, i+key.length()).equalsIgnoreCase(key))
                ++count;
        }

        System.out.println(count);
    }
}