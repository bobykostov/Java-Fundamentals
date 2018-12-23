package com.company;

import java.util.Scanner;
import java.util.TreeMap;

public class pr4countSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<Character, Integer> charMap = new TreeMap<>();

        String line = scan.nextLine();
        char[] lineArr = line.toCharArray();

        for (char c : lineArr) {
            if (charMap.isEmpty() || !charMap.containsKey(c))
            {
                charMap.put(c, 1);
            }
            else
                charMap.put(c, charMap.get(c) + 1);
        }

        for (Character character : charMap.keySet()) {
            System.out.println(character + ": " + charMap.get(character) + " time/s");
        }
    }
}