package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr11replaceTag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "<a[\\s]href=\\\".+\\\">([\\s\\S]+?)<\\/a>?";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        String html = "";

        String line = scan.nextLine();
        while (!"END".equals(line))
        {
            html += line + "\n";
            line = scan.nextLine();
        }

        Matcher matcher = pattern.matcher(html);

        while (matcher.find())
        {
            String edited = matcher.group(0)
                    .replace("<a", "[URL")
                    .replace("</a>", "[/URL]")
                    .replace('>', ']');
            html = html.replace(matcher.group(0), edited);
        }

        System.out.println(html);
    }
}