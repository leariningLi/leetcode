package com.example.haier.BestSoultion;

import org.junit.Test;

/**
 * Created by qdtan on 2020/4/25.
 */
public class NonDecreasingArray {

    @Test
    public void testcheckPossibility(){
//       int[] nums={4,2,3};
       int[] nums={4,2,1};
       System.out.println(checkPossibility(nums));
    }
    public boolean checkPossibility(int[] nums) {
       int i=0;
        int count=0;
        if(nums.length==0){
            return false;
        }
        boolean flag=false;
        while(i<nums.length){
            if(i!=nums.length-1){
                if(nums[i]>nums[i+1]){
                    count++;
                    nums[i]=nums[i+1];
                    if(count>1){
                        flag=false;
                        break;
                    }
                }else{ i++;}
            }else{
                    flag=true;
                i++;
            }
        }
        return flag;
    }
}
