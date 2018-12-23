package com.company;

import java.util.Scanner;

public class pr3parseTags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        while (line.contains("<upcase>") && line.contains("</upcase>"))
        {
            String word = line.substring(line.indexOf("<")+8, line.indexOf("/")-1);
            String phrase = "<upcase>" + word + "</upcase>";
            line = line.replaceFirst(phrase, word.toUpperCase());
        }

        System.out.println(line);
    }
}