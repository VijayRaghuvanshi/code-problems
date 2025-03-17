package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static void main(String[] args) {
        SummaryRange summaryRange =  new SummaryRange();
        //System.out.println( ""+summaryRange.summaryRanges(new int[]{0,1,2,4,5,7}));
        System.out.println( ""+summaryRange.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }

    /**
     * Can we optimise this?
     * @param nums
     * @return
     */
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0){
            return new ArrayList<>();
        }
        if (nums.length ==1){
            return List.of(""+nums[0]);
        }
        List<String> ouputRangeStr = new ArrayList<>();
        int rangeBegin=nums[0];
        String rangeStr = "";
        for(int i=0; i < nums.length;  i++){
            if(rangeStr.equals("")){
                // rangeBegin = nums[i];
                rangeStr = ""+rangeBegin;
            }
            else if(rangeBegin+1 != nums[i]) {
                if (rangeStr.equals(""+rangeBegin)){
                    ouputRangeStr.add(rangeStr);
                }else{
                    ouputRangeStr.add( rangeStr + "->" + rangeBegin);
                }
                rangeBegin =  nums[i];
                rangeStr = rangeBegin+"";

            }else if(rangeBegin+1 == nums[i]){
                rangeBegin =nums[i];
            }
        }

        if (rangeStr.equals(""+rangeBegin)){
            ouputRangeStr.add(rangeStr);
        }else{
            ouputRangeStr.add( rangeStr + "->" + rangeBegin);
        }
        return ouputRangeStr;
    }
}
