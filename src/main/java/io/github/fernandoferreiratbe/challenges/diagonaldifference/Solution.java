package io.github.fernandoferreiratbe.challenges.diagonaldifference;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int counter = 0;

        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        /* Populate matrix */
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ++counter;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(" " + matrix[row][col]);

                if (((col + 1) % matrix.length) == 0) {
                    System.out.println();
                }
            }

        }

        /* Sum main diagonal */
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    mainDiagonal += matrix[row][col];
                }
            }
        }

        /* Sum secondary diagonal */
        int col = matrix.length - 1;

        for (int row = 0; row < matrix.length; row++) {
            secondaryDiagonal += matrix[row][col];
            col--;
        }

        System.out.println("Main diagonal: " + mainDiagonal);
        System.out.println("Secondary diagonal: " + secondaryDiagonal);
        System.out.println("Module of the diagonals' difference: " + Math.abs(mainDiagonal - secondaryDiagonal));
    }
}
