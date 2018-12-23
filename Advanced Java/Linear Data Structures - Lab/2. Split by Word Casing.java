package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pr2splitByWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine()
                .split("[\\\\,;:.!()\'\"/\\[\\]\\s]+");

        List<String> uppercase = new ArrayList<>();
        List<String> lowercase = new ArrayList<>();
        List<String> mixedcase = new ArrayList<>();

        for (String word : words) {
            if (word.trim().length() == 0)
            {
                continue;
            }
            boolean isMixed = false;
            for (int i = 0; i < word.length(); i++) {
                if(!Character.isLetter(word.charAt(i)))
                {
                    mixedcase.add(word);
                    isMixed = true;
                    break;
                }
            }
            if(!isMixed)
            {
                if(word.toUpperCase().equals(word))
                {
                    uppercase.add(word);
                }
                else if (word.toLowerCase().equals(word))
                {
                    lowercase.add(word);
                }
                else
                {
                    mixedcase.add(word);
                }
            }
        }

        System.out.printf("Lower-case: %s%n", String.join(", ", lowercase));
        System.out.printf("Mixed-case: %s%n", String.join(", ", mixedcase));
        System.out.printf("Upper-case: %s%n", String.join(", ", uppercase));
    }
}