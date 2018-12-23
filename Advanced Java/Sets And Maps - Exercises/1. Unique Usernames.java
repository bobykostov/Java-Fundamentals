package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class pr1uniqueUsernames {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<String> names = new LinkedHashSet<>();

        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0)
        {
            String line = scan.nextLine();

            if (names.isEmpty() || !names.contains(line))
            {
                names.add(line);
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}