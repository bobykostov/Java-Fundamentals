package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class pr3textFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] banned = scan.nextLine().split(", ");
        String input = scan.nextLine();

        for (int i = 0; i < banned.length; i++) {
            while (input.contains(banned[i]))
            {
                int startIndex = input.indexOf(banned[i]);
                int endIndex = startIndex + banned[i].length();
                String censor = new String(new char[banned[i].length()]).replace('\0', '*');
                input = input.replace(
                        input.substring(startIndex, endIndex),
                        censor
                );
            }
        }

        System.out.println(input);
    }
}