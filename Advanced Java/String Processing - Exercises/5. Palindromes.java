package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class pr5palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<String> palindromes = new TreeSet<>();
        String[] words = scan.nextLine().split("[,\\.\\?!\\s]+");

        for (String word : words) {
            if (isPalindrome(word))
                palindromes.add(word);
        }

        System.out.println("[" + String.join(", ", palindromes) + "]");
    }

    private static boolean isPalindrome(String word) {
        String reverse = new StringBuilder(word).reverse().toString();
        if (reverse.equals(word))
            return true;
        else
            return false;
    }
}