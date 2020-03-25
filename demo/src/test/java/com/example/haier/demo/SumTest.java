package com.example.haier.demo;

/**
 * Created by qdtan on 2020/2/20.
 */
public class SumTest {
   public static void main(String[]args){
       Solution solution=new Solution();
       int[] arr={2,7,11,15};
       int target=18;
       int[]aa=solution.twoSum(arr,target);
       for(int i=0;i<aa.length;i++){
           System.out.println(aa[i]);
       }

   }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //target  add Number=target return index
        if(numbers==null)return  null;
        int i=0;
        int j=numbers.length-1;
        while(i<j){
         int SumNum=numbers[i]+numbers[j];
            if(SumNum==target){
                return new int[]{i+1,j+1};
            }else{
                if(SumNum<target){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return null;
    }

        //考指针概念
//        int[] arr=new int[2];
//        int m=0;
//        int k=0;
//        for(int i=0;i<numbers.length;i++){
//            for(int j=i+1;j<numbers.length;j++){
//                m=numbers[i];
//                k=numbers[j];
//                if(target==m+k){
//                    arr[0]=i+1;
//                    arr[1]=j+1;
//                    return arr;
//                }
//            }
//        }
//        return null;
//    }
}