package com.company;

import java.util.Scanner;

public class pr5oddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        int[] arr = new int[line.length];

        for (int i = 0; i < line.length; i++)
        {
            arr[i] = Integer.parseInt(line[i]);
        }

        if (arr.length % 2 != 0)
        {
            System.out.println("invalid length");
        }
        else
        {
            for (int i = 0; i < arr.length; i+=2) {
                if (arr[i] % 2 == 0 &&
                        arr[i+1] % 2 == 0)
                {
                    System.out.printf("%d, %d -> both are even%n", arr[i], arr[i+1]);
                }
                else if (arr[i] % 2 != 0 &&
                        arr[i+1] % 2 != 0)
                {
                    System.out.printf("%d, %d -> both are odd%n", arr[i], arr[i+1]);
                }
                else
                {
                    System.out.printf("%d, %d -> different%n", arr[i], arr[i+1]);
                }
            }
        }
    }
}