package com.java.leetcode;

public class CompleteCircuit {
    public static void main(String[] args) {
        CompleteCircuit obj = new CompleteCircuit();
        System.out.println(obj.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
        //   System.out.println(obj.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));

    }

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int startStat = 0;
        int tankGas = 0;
        int i = 0;
        int numOfGas = gas.length;
        boolean circleStarted = true;
        while (startStat < gas.length) {
            int remGag = tankGas + gas[i] - cost[i];
            if (remGag < 0) {
                startStat++;
                circleStarted = false;
                tankGas = 0;
            } else {
                tankGas += remGag;
                circleStarted = true;
            }
            i++;
            if (i > numOfGas - 1) {
                i = 0;
            }
            if (circleStarted && startStat == i) {
                return startStat;
            }
        }
        return -1;
    }

}
