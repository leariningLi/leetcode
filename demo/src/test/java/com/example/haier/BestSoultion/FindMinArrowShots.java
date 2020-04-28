package com.example.haier.BestSoultion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by qdtan on 2020/4/21.
 */
public class FindMinArrowShots {
    public static void main(String[] args){
        int[][] points=new int[][]{{10,16},{2,8}, {1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
    public static int findMinArrowShots(int[][] points) {
        if(points.length==0){
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o->o[1]));
        int end=points[0][1];
        int count=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]>end){
                count++;
                end=points[i][1];
            }
        }
        return count;
    }
}
