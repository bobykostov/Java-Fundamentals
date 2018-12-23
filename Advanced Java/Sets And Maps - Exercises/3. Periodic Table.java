package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class pr3periodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<String> compounds = new TreeSet<>();

        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0)
        {
            String[] chems = scan.nextLine().split("\\s+");

            for (String chem : chems) {
                if (compounds.isEmpty() || !compounds.contains(chem))
                {
                    compounds.add(chem);
                }
            }
        }

        for (String compound : compounds) {
            System.out.print(compound + " ");
        }
    }
}