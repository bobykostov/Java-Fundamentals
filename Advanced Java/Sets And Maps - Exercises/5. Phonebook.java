package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class pr5phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> phonebook = new HashMap<>();

        String line = scan.nextLine();

        while (!"search".equals(line))
        {
            String[] parsed = line.split("-");
            String name = parsed[0];
            String number = parsed[1];

            phonebook.put(name, number);

            line = scan.nextLine();
        }

        line = scan.nextLine();
        while (!"stop".equals(line))
        {
            if (phonebook.containsKey(line))
            {
                System.out.println(line + " -> " + phonebook.get(line));
            }
            else
                System.out.println("Contact " + line + " does not exist.");

            line = scan.nextLine();
        }
    }
}