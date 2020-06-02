package com.example.haier.array;

import java.util.*;

/**
 * Created by qdtan on 2020/3/26.
 */
public class FrequencyTest {
    public static void main(String[] args){
        int[] nums=new int[]{1,2};
        List<Integer> frequencyList=topKFrequent(nums,2);
        for(int aa:frequencyList){
            System.out.println(aa);
        }

    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for (int num : nums) {
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);
        }
        List<Integer> resultList=new ArrayList<>();
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for(int num:nums){
            if(frequencyMap.get(num)==null){
            frequencyMap.put(num,1);
            }else{
               int count= frequencyMap.get(num);
                frequencyMap.remove(num);
                frequencyMap.put(num,++count);
            }
        }
      /*  Collections.checkedSortedMap(frequencyMap,Integer,Integer);
       if(k<=frequencyMap.size()){
           for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
               if(entry.getValue()>=k){
                   resultList.add(entry.getKey());
               }
           }
       }*/
        return resultList;

    }
}
