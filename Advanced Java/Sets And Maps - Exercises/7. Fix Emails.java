package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class pr7fixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        String line = scan.nextLine();

        while (!"stop".equals(line))
        {
            String name = line;
            String email = scan.nextLine();

            if (email.contains(".bg"))
            {
                emails.put(name, email);
            }

            line = scan.nextLine();
        }

        for (String name : emails.keySet()) {
            System.out.println(name + " -> " + emails.get(name));
        }
    }
}