package io.github.fernandoferreiratbe.challenges.stringcomparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;

        Solution.substringCall(s.toCharArray());
        Solution.substringCall2(s, k);
    }

    private static void substringCall2(String s, int k) {
        java.util.List<String> list = new java.util.ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            list.add(s.substring(i, k));
            k += 1;
            if (k > s.length()) break;
        }

        java.util.Collections.sort(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() -1));
    }

    private static void substringCall(char[] s) {
        List<String> list = new ArrayList<>();

        for (int l = 0; l < s.length; l++) {
            if ((l+2 < s.length)) {
                list.add(String.valueOf(s[l]) + String.valueOf(s[l+1]) + String.valueOf(s[l+2]));
            }

        }

        Collections.sort(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() -1));
    }
}
