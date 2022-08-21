package io.github.fernandoferreiratbe.challenges.algorithm.sha256;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Secure Hash Algorithm 2 (SHA-2) is a set of cryptographic hash functions designed by the National Security Agency
 * (NSA). It consists of six identical hashing algorithms (i.e., SHA-256, SHA-512, SHA-224, SHA-384, SHA-512/224,
 * SHA-512/256) with a variable digest size. SHA-256 is a -bit ( byte) hashing algorithm which can calculate a hash code
 * for an input of up to  bits. It undergoes  rounds of hashing and calculates a hash code that is a -digit hexadecimal
 * number.
 *
 * Given a string, print its SHA-256 hash value.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputValue = "";

        do {
            inputValue = input.nextLine();
            String hash = getSha256HashValueFrom(inputValue);
            System.out.println("SHA-256 value -> " + hash);
        } while (!inputValue.equalsIgnoreCase("n"));
    }

    private static String getSha256HashValueFrom(String value) {
        String hash = "";

        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            hash = byteArrayToString(sha.digest(value.getBytes()));
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
