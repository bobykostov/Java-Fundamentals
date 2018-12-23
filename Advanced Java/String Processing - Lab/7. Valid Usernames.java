package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr7validUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        Pattern regex = Pattern.compile("^[\\w-]{3,16}$");
        String line = scan.nextLine();

        while (!"END".equals(line))
        {
            Matcher matcher = regex.matcher(line);

            if (matcher.find())
                list.add("valid");
            else
                list.add("invalid");

            line = scan.nextLine();
        }

        if (list.contains("valid"))
        {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}