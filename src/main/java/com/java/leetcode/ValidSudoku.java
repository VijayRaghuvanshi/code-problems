package com.java.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        if (board == null || board.length < 9) {
            return false;
        }
        Set<String> seen = new HashSet<>();
        char num;
        String rowSeen = "";
        String colSeen = "";
        String boxSeen = "";

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                num = board[i][j];
                if (num != '.') {
                    rowSeen = num + " in row " + i;
                    colSeen = num + " in col " + j;
                    boxSeen = num + " in box " + (i / 3) + "-" + (j / 3);
                    if (!seen.add(rowSeen) || !seen.add(colSeen) || !seen.add(boxSeen)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
