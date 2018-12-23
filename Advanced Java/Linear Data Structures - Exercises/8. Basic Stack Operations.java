package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class pr8basicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nsx = scanner.nextLine().split("\\s+");
        int toPush = Integer.parseInt(nsx[0]);
        int toPop = Integer.parseInt(nsx[1]);
        int isPresent = Integer.parseInt(nsx[2]);

        String[] nums = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < toPush; i++) {
            stack.push(Integer.parseInt(nums[i]));
        }

        for (int i = 0; i < toPop; i++) {
            stack.pop();
        }

        if (stack.contains(isPresent))
        {
            System.out.println("true");
        }
        else if (stack.isEmpty())
        {
            System.out.println("0");
        }
        else
        {
            int min = Integer.MAX_VALUE;

            while (!stack.isEmpty())
            {
                if (stack.peek() < min)
                {
                    min = stack.pop();
                }
                else
                {
                    stack.pop();
                }
            }

            System.out.println(min);
        }
    }
}