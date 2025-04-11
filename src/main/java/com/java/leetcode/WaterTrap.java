package com.java.leetcode;

import java.util.Objects;

public class WaterTrap {

    public static void main(String[] args) {
        WaterTrap trapObj = new WaterTrap();
        System.out.println("trapped water: " + trapObj.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println("trapped water: " + trapObj.trap(new int[]{4, 2, 0, 3, 2, 5}));
        System.out.println("trapped water: " + trapObj.trap(new int[]{4, 2, 3}));


    }

    public int trap(int[] height) {

        if (Objects.isNull(height) || height.length <= 2) {
            return 0;
        }
        int trappedWater = 0;

        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            trappedWater += Math.min(left[i], right[i]) - height[i];
        }
        return trappedWater;
    }
}