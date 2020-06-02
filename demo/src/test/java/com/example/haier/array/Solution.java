package com.example.haier.array;

/**
 * Created by qdtan on 2020/3/25.
 */
public class Solution {
    public static void main(String[] args){
        int[] nums=new int[]{3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }

    /**
     * 数组排序
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int a=nums[i];
                    nums[i]=nums[j];
                    nums[j]=a;
                }
            }

        }
        return nums[nums.length-k];
    }
}
