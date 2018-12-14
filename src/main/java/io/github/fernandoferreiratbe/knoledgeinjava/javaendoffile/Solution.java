package io.github.fernandoferreiratbe.knoledgeinjava.javaendoffile;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int lineNumber = 0;

        try {
            Scanner scan = new Scanner(System.in);

            do {
                String lineContent = scan.nextLine();
                System.out.printf("%d %s%n", ++lineNumber, lineContent);
            } while (scan.hasNext());

            scan.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
