package com.company;

import java.util.Scanner;

public class pr8getFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        int[] arr = new int[line.length];

        for (int i = 0; i < line.length; i++)
        {
            arr[i] = Integer.parseInt(line[i]);
        }

        String[] comm = scanner.nextLine().split("\\s+");
        int numOfEl = Integer.parseInt(comm[1]);
        String kindOfEl = comm[2];

        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;

            if (kindOfEl.equals("even"))
            {
                if (arr[i] % 2 == 0)
                {
                    System.out.printf("%d ", arr[i]);
                    ++count;
                }
            }
            else if (kindOfEl.equals("odd"))
            {
                if (arr[i] % 2 != 0)
                {
                    System.out.printf("%d ", arr[i]);
                    ++count;
                }
            }

            if (count == numOfEl)
            {
                break;
            }
        }
    }
}