package com.example.haier.BestSoultion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qdtan on 2020/5/9.
 */
public class PartitionLabels {
    @Test
    public void testPartitionLabels(){
        String s="ababcbacadefegdehijhklij";
        System.out.println(Arrays.toString(partitionLabels(s).toArray()));
    }
    public List<Integer> partitionLabels(String S) {
        if(S.length()==0){
            return null;
        }
        int i=0;
        int len=S.length();
        int beginIndex=0;
        int endIndex=S.lastIndexOf(S.charAt(i));
        List<Integer> indexList=new ArrayList<>();
        char beginChar;
        while(i<len){
            if(i<endIndex){
              if(S.charAt(i)!=S.charAt(i+1)&&S.lastIndexOf(S.charAt(i+1))>endIndex){
                      endIndex=S.lastIndexOf(S.charAt(i+1));
              }else{
                  i++;
                  continue;
              }
            }else{
                int size=endIndex-beginIndex+1;
                indexList.add(size);
                i++;
                beginIndex=i;
                if(i<len){
                endIndex=S.lastIndexOf(S.charAt(i));
                }
            }
        }
        return indexList;
    }
}
