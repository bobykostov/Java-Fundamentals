package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class pr3formattingNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String aHex = Integer.toHexString(a);
        char[] chars1 = new char[10-aHex.length()];
        Arrays.fill(chars1, ' ');
        String spaces1col = new String(chars1);

        String aBin = Integer.toBinaryString(a);
        aBin = String.format("%10s", aBin);
        aBin = aBin.replace(' ', '0');

        String bform = String.format("%.2f", b);
        String cform = String.format("%.3f", c);

        String spaces3 = new String(new char[10-bform.length()]).replace('\0', ' ');
        String spaces4 = new String(new char[10-cform.length()]).replace('\0', ' ');

        System.out.printf("|%s%s|%s|%s%s|%s%s|",
                aHex.toUpperCase(),
                spaces1col,
                aBin,
                spaces3,
                bform,
                cform,
                spaces4);
    }
}