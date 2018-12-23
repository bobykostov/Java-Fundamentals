package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class pr7reverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split("\\s+");
        Integer[] nums = new Integer[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (Integer num : nums) {
            stack.push(num);
        }

        while (!stack.isEmpty())
        {
            System.out.print(stack.pop() + " ");
        }
    }
}