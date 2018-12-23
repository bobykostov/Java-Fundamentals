package com.company;

import java.util.Scanner;

public class pr4unicodeCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        for (int i = 0; i < line.length(); i++) {
            System.out.print("\\u" + Integer.toHexString(line.charAt(i) | 0x10000).substring(1));
        }
    }
}