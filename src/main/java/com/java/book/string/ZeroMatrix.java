package com.java.book.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algo such that if an element in m*n matrix 0, its entire row and column set to 0.
 */
public class ZeroMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 3},
                {4, 5, 0},
                {0, 8, 9}
        };
        System.out.println("Matrix before rotation");
        printMatrix(matrix);
        System.out.println();
        //rotate matrix
        zeroMatrix(matrix);
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

    public static void zeroMatrix(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        //1. mark the index with zero value.
        Set<String> zeroIndexes = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroIndexes.add(String.format("row:%s", i));
                    zeroIndexes.add(String.format("col:%s", j));
                }
            }
        }
        //1. replace zero indexes with zero value.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (zeroIndexes.contains(String.format("row:%s", i)) || zeroIndexes.contains(String.format("col:%s", j))) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
