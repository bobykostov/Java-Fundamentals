package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class pr4countSameValuesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> result = new HashMap<>();

        String[] input = scanner.nextLine().split("\\s+");

        for (String number : input) {
            if (!result.containsKey(number))
                result.put(number, 1);
            else
                result.put(number, result.get(number) + 1);
        }

        for (String key : result.keySet()) {
            System.out.println(key + " - " + result.get(key) + " times");
        }
    }
}