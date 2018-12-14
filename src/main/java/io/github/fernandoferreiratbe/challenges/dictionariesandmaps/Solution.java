package io.github.fernandoferreiratbe.challenges.dictionariesandmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.containsKey(s)) {
                Integer phoneNumber = phoneBook.get(s);
                if (phoneNumber.toString().isEmpty()) {
                    System.out.println("Not found.");
                    return;
                }
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
