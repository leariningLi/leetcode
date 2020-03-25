package com.example.haier.demo;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by qdtan on 2020/3/5.
 */
public class MergeArrayTest {
    public static void main(String[] args){
        int[] nums1 =new int[]{1,2,3,0,0,0};
        int m=3;
        int[] nums2=new int[]{2,5,6};
        int n=3;
        int[] arr=merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(arr));
    }
     //目的是合并数组到nums1
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int k=m+n-1;
        while(i>=0||j>=0){
            if(i<0){
                nums1[k--]=nums2[j--];
            }else if(j<0){
                nums1[k--]=nums1[i--];
            }else if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }

            }
        return nums1;
    }
}
