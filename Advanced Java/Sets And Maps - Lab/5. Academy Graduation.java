package com.company;

import java.util.Scanner;
import java.util.TreeMap;

public class pr5academyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Double> gradList = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0)
        {
            String student = scanner.nextLine();
            String[] scoresStr = scanner.nextLine().split("\\s+");

            double scoreAvg = 0;

            for (String score : scoresStr) {
                scoreAvg += Double.parseDouble(score);
            }

            scoreAvg = scoreAvg/scoresStr.length;

            gradList.put(student, scoreAvg);
        }

        for (String student : gradList.keySet()) {
            System.out.println(student + " is graduated with " + gradList.get(student));
        }
    }
}