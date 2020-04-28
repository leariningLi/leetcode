package com.example.haier.BestSoultion;

import java.util.Arrays;

/**
 * Created by qdtan on 2020/4/7.
 */
public class FindContentChildren {
    public static void main(String[] args){
        int[] g={1,2};
        int[] s={1,2,3};
        int count=findContentChildren(g,s);
        System.out.println(count);
    }
    public static int findContentChildren(int[] g, int[] s) {
        if(g==null||s==null){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0,j=0;
        while(i<g.length&&j<s.length){
            if(g[i]<=s[j]){
                i++;
            }else {
                j++;
            }
        }
        return i;
    }
}
