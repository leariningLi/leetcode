package com.example.haier.demo;

import org.junit.jupiter.api.Test;

/**
 * Created by qdtan on 2020/3/5.
 */
public class ValidPalindromeTest {//abcba
    public  static void main(String[] args){
        System.out.println(testValidPalindrome("abca"));
    }
    public static boolean testValidPalindrome(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i++)!=s.charAt(j--)){
                return inValidPalindrome(s,i++,j)||inValidPalindrome(s,i,j--);
            }
        }
        return true;
    }

    private static boolean inValidPalindrome(String s, int i, int j) {
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
