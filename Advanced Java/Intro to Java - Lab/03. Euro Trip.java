package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class euroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price1kg = 1.20;
        double quantity = scanner.nextDouble();

        BigDecimal priceInBGN = new BigDecimal(price1kg*quantity);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");

        BigDecimal inMarks = exchangeRate.multiply(priceInBGN);

        System.out.printf("%.2f marks", inMarks);
    }
}