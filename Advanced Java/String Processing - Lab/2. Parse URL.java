package com.company;

import java.util.Scanner;

public class pr2parseURL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            String line = scan.nextLine();
            String protocol = line.substring(0, line.indexOf(":"));
            line = line.substring(line.indexOf(":")+3, line.length());
            String server = line.substring(0, line.indexOf("/"));
            String resources = line.substring(line.indexOf("/")+1, line.length());;

            System.out.println("Protocol = " + protocol);
            System.out.println("Server = " + server);
            System.out.println("Resources = " + resources);
        }
        catch (Exception e)
        {
            System.out.println("Invalid URL");
        }
    }
}