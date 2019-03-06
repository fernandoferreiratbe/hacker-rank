package io.github.fernandoferreiratbe.knoledgeinjava.stringreverse;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        char[] s = "madam".toCharArray();
        int position = s.length-1;

        char[] c = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            c[i] = s[position--];

        }

        System.out.println((Arrays.equals(s, c)) ? "Yes" : "No");
    }
}
