package com.java.leetcode;

class RemoveElementFromArrayInline {
    public int removeElement(int[] nums, int val) {

        if(nums==null){
            return 0;
        }
        int arrLength = nums.length;
        if(arrLength==1){
            if(nums[0]==val){
                return 0;
            }else{
                return 1;
            }
        }

        int i =0;
        int p=arrLength-1;
        int remLen = nums.length;
        while(i <= p){
            if(nums[i]==val && nums[p]!=val){
                nums[i] = nums[p];
                i++;
                p--;
                remLen--;
            }else if(nums[i]!=val && nums[p]==val){
                i++;
                p--;
                remLen--;
            }else if(nums[i]==val && nums[p]==val){
                p--;
                remLen--;
            }else if(nums[i]!=val && nums[p]!=val){
                i++;
            }
        }
        return remLen;
    }
}
