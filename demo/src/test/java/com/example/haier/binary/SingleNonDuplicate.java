package com.example.haier.binary;

import org.junit.Test;

/**
 * Created by qdtan on 2020/5/26.
 */
public class SingleNonDuplicate {
    @Test
    public void testSingleNonDuplicate(){
        int  nums[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    //每次都是重复的，找出单个的
    //11233
    public int singleNonDuplicate(int[] nums) {
        int i=0;int h=nums.length;
        while(i<h){
            int mid=i+(h-1)/2;
            if(mid==h&&nums[mid]==nums[mid-1]){
                h=mid-2;
            }else if(mid==h&&nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else if(nums[mid]==nums[mid-1]){
                h=mid-2;
            }else{
                i=mid+2;
            }

        }
        return -1;
    }
}
