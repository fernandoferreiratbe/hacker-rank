package io.github.fernandoferreiratbe.challenges.datatypes;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        int intValue = 0;
        double d = 4.0;
        double doubleValue = 0.0;
        String s = "HackerRank";
        String stringValue = "";

        Scanner scan = new Scanner(System.in);

        intValue = scan.nextInt();

        doubleValue = scan.nextDouble();

        scan.nextLine();

        stringValue = scan.nextLine();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

    }
}
