package com.company;

import java.util.Scanner;

public class pr2triangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aX = scanner.nextDouble();
        double aY = scanner.nextDouble();
        scanner.nextLine();
        double bX = scanner.nextDouble();
        double bY = scanner.nextDouble();
        scanner.nextLine();
        double cX = scanner.nextDouble();
        double cY = scanner.nextDouble();

        if (aX/aY == bX/bY && bX/bY == cX/cY)
        {
            System.out.println(0);
        }
        else
        {
            long calc = Math.round((aX*(bY-cY) + bX*(cY-aY) + cX*(aY-bY))/2);
            long area = Math.abs(calc);
            System.out.println(area);
        }
    }
}