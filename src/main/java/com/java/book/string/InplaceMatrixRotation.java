package com.java.book.string;

import java.util.Objects;

/**
 * Rotate matrix by 90 degree by used new matrix;
 */
public class InplaceMatrixRotation {


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
        rotateMatrixInplace(matrix);
        System.out.println("Matrix after rotation");
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrixInplace(int[][] matrix) {
        if (Objects.isNull(matrix)) {
            return;
        }
        int length = matrix.length;
        //Step 1. transpose the matrix means rows becomes column and column becomes rows.
        for (int i = 0; i < length; i++) {
            /*
              1. inner loop j initialize with i because first row should be replaced with first column and sec row with sec col and so on.
              2. if with initialize j with i+1 then we are able to optimize it of self-swap and
             */
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Step 2. reverse the rows by 2 pointers
        for (int i = 0; i < length; i++) {
            for (int j = 0, k = length - 1; j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }

}
