package com.example.haier.BestSoultion;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qdtan on 2020/4/9.
 */
public class EraseOverlapInterval {
    public static void main(String[] args){
        int[][] intervals=new int[][]{{1,2}, {2,3}, {3,4}, {1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
    //找出去除最小数量，保证剩余区间不重叠.
    public static int eraseOverlapIntervals(int[][] intervals) {
        int count=1;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                continue;
            }
            end=intervals[i][1];
            count++;
        }
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals[i].length;j++){
                System.out.println(intervals[i][j]);
            }
            if(intervals[i][0]<end){
                continue;
            }
            end=intervals[i][1];
            count++;
        }
        return intervals.length-count;
        }

    }

