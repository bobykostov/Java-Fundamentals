package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class pr9matchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "^[A-Z][a-z]+ [A-Z][a-z]+$";
        String line = scan.nextLine();

        while (!"end".equals(line))
        {
            if (Pattern.matches(regex, line))
                System.out.println(line);

            line = scan.nextLine();
        }
    }
}