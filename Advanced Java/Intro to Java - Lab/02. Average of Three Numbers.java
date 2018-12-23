package com.company;

import java.util.Scanner;

public class averageOf3Nums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();

        System.out.printf("%.2f", (first+second+third)/3);
    }
}