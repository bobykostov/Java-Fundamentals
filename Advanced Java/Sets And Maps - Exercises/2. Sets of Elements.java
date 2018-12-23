package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class pr2setsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Integer> nSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> mSet = new LinkedHashSet<>();

        String[] nm = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        while (n-- > 0)
        {
            int num = Integer.parseInt(scan.nextLine());

            if (nSet.isEmpty() || !nSet.contains(num))
            {
                nSet.add(num);
            }
        }

        while (m-- > 0)
        {
            int num = Integer.parseInt(scan.nextLine());

            if (mSet.isEmpty() || !mSet.contains(num))
            {
                mSet.add(num);
            }
        }

        for (Integer el : nSet) {
            if (mSet.contains(el)){
                System.out.print(el + " ");
            }
        }
    }
}