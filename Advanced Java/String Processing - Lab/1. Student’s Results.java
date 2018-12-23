package com.company;

import java.util.Scanner;

public class pr1studentsResults {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" - ");
        String name = line[0];
        String[] scores = line[1].split(", ");
        double JAdv = Double.parseDouble(scores[0]);
        double JavaOOP = Double.parseDouble(scores[1]);
        double AdvOOP = Double.parseDouble(scores[2]);
        double average = (JAdv + JavaOOP + AdvOOP) / 3;

        System.out.println(String.format(
                "%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|",
                "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"
        ));

        System.out.println(String.format(
                "%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",
                name, JAdv, JavaOOP, AdvOOP, average
        ));
    }
}