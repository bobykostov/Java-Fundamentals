package com.company;

import java.util.Scanner;

public class transportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        scanner.nextLine();
        String time = scanner.nextLine();

        double cost = 0;

        if (distance > 0 && distance < 20)
        {
            if (time.equals("day"))
            {
                cost = distance*0.79+0.70;
            }
            else if (time.equals("night"))
            {
                cost = distance*0.90+0.70;
            }
        }
        else if (distance >= 20 && distance <100)
        {
            cost = distance*0.09;
        }
        else if (distance > 100)
        {
            cost = distance*0.06;
        }

        System.out.printf("%.2f", cost);
    }
}