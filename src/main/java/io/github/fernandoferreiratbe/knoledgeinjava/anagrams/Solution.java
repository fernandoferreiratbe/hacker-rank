package io.github.fernandoferreiratbe.knoledgeinjava.anagrams;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.isAnagram("CAT", "ATc"));
    }

    static boolean isAnagram(String a, String b) {
        char[] chars = a.trim().toLowerCase().toCharArray();
        char[] chars1 = b.trim().toLowerCase().toCharArray();

        if (a.length() != b.length()) {
            return false;
        }

        for (char c: chars) {
            int counterA = 0;
            int counterB = 0;
            for(int i = 0; i < chars.length; i++) {
                if (c == chars[i]) {
                    counterA++;
                }
            }

            for(int i = 0; i < chars1.length; i++) {
                if (c == chars1[i]) {
                    counterB++;
                }
            }

            if (counterA != counterB) {
                return false;
            }
        }
        return true;
    }
}
