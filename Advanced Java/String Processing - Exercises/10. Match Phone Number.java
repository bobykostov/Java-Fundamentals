package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class pr10matchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "^\\+359([ -])2\\1\\d{3}\\1\\d{4}$";
        String line = scan.nextLine();

        while (!"end".equals(line))
        {
            if (Pattern.matches(regex,line))
                System.out.println(line);

            line = scan.nextLine();
        }
    }
}