package com.company;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (first.equals(""))
        {
            first = "*****";
        }
        if (second.equals(""))
        {
            second = "*****";
        }

        System.out.println("Hello, " + first + " " + second + "!");
    }
}