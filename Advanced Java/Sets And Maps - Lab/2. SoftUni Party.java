package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class pr2softuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> regular = new TreeSet<>();

        String input = scanner.nextLine();
        while (!"PARTY".equals(input)) {
            regular.add(input);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!"END".equals(input)) {
            regular.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(regular.size());

        for (String reg : regular) {
            System.out.println(reg);
        }
    }
}