package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class productOfNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int last = scanner.nextInt();

        BigInteger product = BigInteger.ONE;

        for (int i = first; i <= last; i++) {
            BigInteger number = new BigInteger("" + i);
            product = product.multiply(number);
        }

        System.out.printf("product[%d..%d] = %d", first, last, product);
    }
}