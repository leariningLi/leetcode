package com.example.haier.binary;

import org.junit.Test;

/**
 * Created by qdtan on 2020/5/25.
 */
public class NextGreatestLetter {


    @Test
    public void testNextGreatestLetter(){
        char[] letters = new char[]{'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters,'j'));
    }
    /**
     * 思路
     * 大于给定元素最小的元素，特殊情况比所有数组的元素都大，选定最小的
     * 比较的话可以选择二分杈数比较，如果比中间的大，更改最小元素，如果比中间小择选择大的
     *
     * @param letters
     * @param target
     * @return
     */
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int len=letters.length;
        int h=len-1;
        while(l<=h){
            int sqrt=l+(h-1)/2;
            if(target<=letters[sqrt]){
               h=sqrt-1;
                }
            else{
                l=sqrt+1;
            }
        }
        return l < len ?  letters[l] :  letters[0];
    }
}
