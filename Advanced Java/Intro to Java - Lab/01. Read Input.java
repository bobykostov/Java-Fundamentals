package com.company;

import java.util.Scanner;

public class readInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next("\\w+");
        String secondWord = scanner.next("\\w+");
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int thirdInt = scanner.nextInt();
        int sumOfNums = firstInt+secondInt+thirdInt;
        scanner.nextLine();
        String last = scanner.nextLine();
        System.out.println(firstWord + " " + secondWord +
        " " + last + " " + sumOfNums);
    }
}
