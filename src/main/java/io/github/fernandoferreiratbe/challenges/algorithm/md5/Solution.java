package io.github.fernandoferreiratbe.challenges.algorithm.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String value;
        Scanner input = new Scanner(System.in);
        do {
            value = input.nextLine();
            System.out.println("Data value found " + value);
            System.out.println(getMd5HashValueFrom(value));
        } while (!value.equalsIgnoreCase("n"));
    }

    private static String getMd5HashValueFrom(String value) {
        String hash = "";

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            hash = byteArrayToString(md5.digest(value.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }

        return hash;
    }

    private static String byteArrayToString(byte[] value) {
        StringBuilder builder = new StringBuilder();

        for (byte b: value) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }
}

