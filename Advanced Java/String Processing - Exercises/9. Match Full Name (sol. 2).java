package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr9matchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
        String line = scan.nextLine();

        while (!"end".equals(line))
        {
            Matcher matcher = pattern.matcher(line);

            if (matcher.find())
                System.out.println(matcher.group());

            line = scan.nextLine();
        }
    }
}