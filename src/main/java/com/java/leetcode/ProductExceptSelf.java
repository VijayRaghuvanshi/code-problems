package com.java.leetcode;

public class ProductExceptSelf {

    public static void main(String[] args) {
        ProductExceptSelf obj = new ProductExceptSelf();
        obj.productExceptSelf(new int[]{-1, 1, 0, -3, 3});
    }

    public int[] productExceptSelf(int[] nums) {

        if (nums.length == 1) {
            return nums;
        }
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Compute prefix product
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            output[i] = prefix;
            prefix *= nums[i];
        }

        // Step 2: Compute suffix product and update output
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= suffix;
            suffix *= nums[i];
        }

        return output;

    }
}


