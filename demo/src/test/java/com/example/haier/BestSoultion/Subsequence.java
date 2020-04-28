package com.example.haier.BestSoultion;

import io.micrometer.core.instrument.util.StringUtils;
import org.junit.Test;

/**
 * Created by qdtan on 2020/4/25.
 */
public class Subsequence {
    @Test
    public void testIsSubsequence(){
//        String s = "abc", t = "ahbgdc";
        String s = "", t = "";
        System.out.println(isSubsequence(s,t));
    }

    public boolean isSubsequence(String s, String t) {
        boolean isSub=false;
        if(t==null||t.equals("") && s!=null&&!s.equals("") ){
            return false;
        }
        if(s==null||s.equals("")){
            return true;
        }
        int i=0,j=0;
        char[] sArray=s.toCharArray();
        while(i<t.length()){
            if(sArray[j]==t.charAt(i)){
                if(j==sArray.length-1){
                    isSub=true;
                    break;
                }
                i++;
                j++;
            }else{
                i++;
            }
        }
        return isSub;
    }
}
