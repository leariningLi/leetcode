package com.example.haier.array;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by qdtan on 2020/4/2.
 */
public class FrequencySort {
    public static void main(String[] args){
       String dataResult= frequencySort("Aabb");
        System.out.println(dataResult);
    }
    //频率最高的字符放在前面tree eetr  1，记住单词和频率map可以排序 key字母 value是值
    public static String frequencySort(String s) {
        char[] arrays=s.toCharArray();
        HashMap<Character,Integer>charMap=new HashMap<>();
        for(char a:arrays){
            charMap.put(a,charMap.getOrDefault(a,0)+1);
        }
        int i=arrays.length;
        String str="";
        while(i>0){
            for(char aa:charMap.keySet()){
                int value=charMap.get(aa);
                if(value==i){
                    str+=getStr(aa,value);
                }
            }
            i--;
        }
        return str;
    }

    private static String getStr(char aa, int value) {
        String str="";
            while(value>0){
                str+=aa;
                value--;
            }
        return str;
    }
}
