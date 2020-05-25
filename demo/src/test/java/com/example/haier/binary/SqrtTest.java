package com.example.haier.binary;

import org.junit.Test;

/**
 * Created by qdtan on 2020/5/18.
 */
public class SqrtTest {
    @Test
    public void testSqrt(){
        System.out.println(mySqrt(8));
    }
    public int mySqrt(int x) {
        //分析 求平方 实际上是找是否等于平方数  如果等于反回 如果不等于判断 信算的中间数 和平方值比较
        //中间数大于平方值  起始范围mid+1到h  小于于l到mid-1
        //算中间值是动态变化的 l+(h-l)/2
        if(x==1){
            return x;
        }
        int l=1;
        int h=x;
        while(l<=h){
           int mid=l+(h-l)/2;
            int sqrt=x/mid;
            if(sqrt==mid){
                return mid;
            }else if(mid>sqrt){
                h=mid-1;
            }else{
                l=mid+1;
            }

        }
        return h;

    }
}
