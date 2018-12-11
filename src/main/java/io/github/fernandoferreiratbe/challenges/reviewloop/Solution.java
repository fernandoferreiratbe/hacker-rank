package io.github.fernandoferreiratbe.challenges.reviewloop;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while(scan.hasNext()) {
//            StringBuilder even = new StringBuilder();
//            StringBuilder odd  = new StringBuilder();
//            String message     = scan.nextLine();
//
//            if (!message.matches("[0-9]") && message != " ") {
//                int index = 0;
//
//                for (char letter : message.toCharArray()) {
//                    if ((index % 2) == 0) {
//                        even.append(letter);
//                    } else {
//                        odd.append(letter);
//                    }
//                    index++;
//                }
//
//                System.out.println(even.toString() + " " + odd.toString());
//            }
//        }

        Scanner scan = new Scanner(System.in);

        int numberOfMessages = scan.nextInt();

        for(int i = 0; i < numberOfMessages; i++) {
            String originalMessage = scan.next();
            char[] message     = originalMessage.toCharArray();
            StringBuilder even = new StringBuilder();
            StringBuilder odd  = new StringBuilder();

            for(int position = 0; position < message.length; position++) {
                if ((position % 2) == 0) {
                    even.append(message[position]);
                } else {
                    odd.append(message[position]);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
