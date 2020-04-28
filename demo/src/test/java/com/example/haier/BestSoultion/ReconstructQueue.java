package com.example.haier.BestSoultion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by qdtan on 2020/4/21.
 */
public class ReconstructQueue {
    public static void main(String[] args){
        int[][] people=new int[][]{{7,0}, {4,4}, {7,1}, {5,0},{6,1}, {5,2}};
        System.out.println(Arrays.toString(reconstructQueue(people)));
    }
    public static int[][] reconstructQueue(int[][] people) {
        if(people.length==0){
            return new int[0][0];
        }
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        List<int[]> queue = new ArrayList<>();
        for (int[] p : people) {
            queue.add(p[1], p);
        }
        return queue.toArray(new int[queue.size()][]);
    }
}
