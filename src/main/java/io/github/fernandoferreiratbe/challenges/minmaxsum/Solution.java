package io.github.fernandoferreiratbe.challenges.minmaxsum;

public class Solution {
    static void miniMaxSum(int[] arr) {
        int temp = 0;

        for (int m = 0; m < arr.length; m++) {
            for (int i = 0; i < arr.length; i++) {
                int value = arr[i];

                for (int j = i; j < arr.length; j++) {
                    if (value > arr[j]) {
                        temp = arr[j];
                        arr[j] = value;
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        long min = 0;
        long max = 0;

        for(int i = 0; i < (arr.length - 1); i++) {
            min += arr[i];
        }

        for(int i = (arr.length - 1); i > 0; i--) {
            max += arr[i];
        }

        System.out.println("");
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 3, 4, 1};
        int[] another = new int[] {7, 69, 2, 221, 8974};
        Solution.miniMaxSum(arr);
        Solution.miniMaxSum(another);
    }
}
