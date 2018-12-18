package io.github.fernandoferreiratbe.knoledgeinjava.javaloopsdois;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int k = 0; k < t; k++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = 0;

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    s += (int) (a + ((Math.pow(2, i)) * b));
                } else {
                    s += (int) ((Math.pow(2, i)) * b);
                }
                System.out.print(s + " ");
            }

            System.out.println("");
        }
    }
}
