package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class pr6minerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, Integer> resources = new HashMap<>();

        String line = scan.nextLine();

        while (!"stop".equals(line))
        {
            String resource = line;
            Integer amount = Integer.parseInt(scan.nextLine());

            if (resources.isEmpty() || !resources.containsKey(resource))
            {
                resources.put(resource, amount);
            }
            else
                resources.put(resource, resources.get(resource) + amount);

            line = scan.nextLine();
        }

        for (String resource : resources.keySet()) {
            System.out.println(resource + " -> " + resources.get(resource));
        }
    }
}