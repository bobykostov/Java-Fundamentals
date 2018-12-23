package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pr12vehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> vehicles = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int vehiclesSold = 0;
        String customer = scanner.nextLine();
        while (!customer.equals("End of customers!"))
        {
            String seats = customer.substring(8, customer.length()-5).trim();
            String demand = customer.toLowerCase().charAt(0) + seats;

            if (!vehicles.contains(demand))
            {
                System.out.println("No");
            }
            else
            {
                int price = Integer.parseInt(seats) * Character.codePointAt(demand, 0);
                System.out.printf("Yes, sold for %d$%n", price);
                vehicles.remove(demand);
                ++vehiclesSold;
            }

            customer = scanner.nextLine();
        }

        System.out.printf("Vehicles left: %s%n", String.join(", ", vehicles));
        System.out.printf("Vehicles sold: %d%n", vehiclesSold);
    }
}