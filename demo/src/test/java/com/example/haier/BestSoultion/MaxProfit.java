package com.example.haier.BestSoultion;

import org.junit.Test;

/**
 * Created by qdtan on 2020/4/22.
 */
public class MaxProfit {
    @Test
    public  void testMaxProfit(){
//        int[] prices={7,1,5,3,6,4};
        int[] prices={1,2,3,4,5};
        //自行定义买入天数和卖出最大利润
        //第一种解决方案 两个for循环遍历算最大值
//        maxProfit(prices);
//        maxProfit2(prices);
        System.out.println(maxProfit3(prices));
    }
//设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票
    public int maxProfit3(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
       /* if(prices.length==0){
            return 0;
        }
        int minValue=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(minValue<prices[i]){
                max=max+prices[i]-minValue;
                minValue=prices[i+1];
            }else{
                minValue=prices[i];
            }
        }
        return max;*/
    }
    public int maxProfit2(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int minValue=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(minValue<prices[i]){
                max=Math.max(max,prices[i]-minValue);
            }else{
                minValue=prices[i];
            }
        }
        return max;
    }
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int maxvalue=0,inputDay=0,outDay=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int m=prices[j]-prices[i];
                if(m>maxvalue){
                    maxvalue=m;
                    inputDay=i;
                    outDay=j;
                }
            }
        }
        inputDay=inputDay+1;
        outDay=outDay+1;
        System.out.println("输入"+inputDay+"输出"+outDay+"最大值"+maxvalue);
        return maxvalue;
    }
}
