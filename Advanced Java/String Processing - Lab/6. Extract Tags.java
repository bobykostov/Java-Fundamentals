package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr6extractTags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        while (!"END".equals(line))
        {
            Pattern regex = Pattern.compile("<.*?>");
            Matcher matcher = regex.matcher(line);

            while (matcher.find())
            {
                System.out.println(matcher.group());
            }

            line = scan.nextLine();
        }
    }
}