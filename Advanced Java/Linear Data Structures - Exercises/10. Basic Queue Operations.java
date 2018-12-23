package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class pr10basicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nsx = scanner.nextLine().split("\\s+");
        int toOffer = Integer.parseInt(nsx[0]);
        int toPoll = Integer.parseInt(nsx[1]);
        int isPresent = Integer.parseInt(nsx[2]);

        String[] nums = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < toOffer; i++) {
            queue.offer(Integer.parseInt(nums[i]));
        }

        for (int i = 0; i < toPoll; i++) {
            queue.poll();
        }

        if (queue.contains(isPresent))
        {
            System.out.println("true");
        }
        else if (queue.isEmpty())
        {
            System.out.println("0");
        }
        else
        {
            int min = Integer.MAX_VALUE;

            while (!queue.isEmpty())
            {
                if (queue.peek() < min)
                {
                    min = queue.poll();
                }
                else
                {
                    queue.poll();
                }
            }

            System.out.println(min);
        }
    }
}