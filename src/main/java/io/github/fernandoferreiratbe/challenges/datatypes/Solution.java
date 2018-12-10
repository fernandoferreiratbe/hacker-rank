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

        System.out.println("Type a int value");
        intValue = scan.nextInt();

        System.out.println("Type a double value");
        doubleValue = scan.nextDouble();

        stringValue = scan.next();

    }
}
