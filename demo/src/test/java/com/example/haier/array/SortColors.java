package com.example.haier.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by qdtan on 2020/4/2.
 */
public class SortColors {
    public static void main(String[] args){
        int nums[]={1,0,2,0,2,1};
        nums=sortColors( nums);
        System.out.println(Arrays.toString(nums));
    }
    //对数组元素排序Input: [2,0,2,1,1,0]  Output: [0,0,1,1,2,2]
   public static int[]  sortColors(int[] nums) {
        int zero=-1;int i=0;int j=nums.length-1;
        while(i<j){
            if(nums[i]==0){
                swap(nums,++zero,i++);
            }else if(nums[i]==2){
                swap(nums,i++,j--);
            }else{
                i++;
            }
        }
        return nums;

    }

    private static void swap(int[] nums, int zero, int i) {
        int k=nums[zero];
        nums[zero]=nums[i];
        nums[i]=k;
    }
  /*  void sortColors(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
      for(int num:nums){
          map.put(num,map.getOrDefault(num,0)+1);
          set.add(num);
      }
        //取数比较好取，现在难点是排序
        int a=set.size();
        Integer m[]=(Integer[])set.toArray();
        int len=m.length-1;
        int k=0;
        while(len>0){
            if(m[len]<m[len--]){
                int b=m[len];
                m[len]=m[len--];
                m[len--]=b;
            }
            if(m[k]>m[k++]){
                int b=m[k];
                m[k]=m[k++];
                m[k++]=b;
            }
        }



    }*/
}
