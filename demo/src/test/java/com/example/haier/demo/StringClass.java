package com.example.haier.demo;

import java.util.HashMap;

/**
 * Created by qdtan on 2020/1/14.
 */
public class StringClass {
    public static void main(String[] args){
       System.out.println(isValid("([)]"));
    }
    public static boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        int len=s.length();
        boolean isValid=true;
        for(int i=0;i<len/2;i=i+2){
            char sChar=s.charAt(i);
            char endChar=s.charAt(i+1);
            char endValue=map.get(sChar);
            if(endChar==endValue){
                continue;
            }else{
                isValid=false;
            }
        }
        return isValid;


}

}
