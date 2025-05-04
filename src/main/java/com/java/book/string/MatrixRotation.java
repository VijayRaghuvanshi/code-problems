package com.java.book.string;

import java.util.Objects;

/**
 * Rotate matrix by 90 degree by used new matrix;
 */
public class MatrixRotation {


    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Matrix before rotation");
        printMatrix(matrix);
        System.out.println();
        //rotate matrix
        int[][] rotated = rotateMatrix(matrix);
        System.out.println("Matrix after rotation");
        printMatrix(rotated);

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        if (Objects.isNull(matrix)) {
            return null;
        }
        int[][] rotated = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            int column = matrix[0].length;
            for (int j = 0; j < matrix[0].length; j++) {
                rotated[j][matrix[0].length - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }
}
