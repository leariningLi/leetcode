package com.example.haier.demo;

/**
 * Created by qdtan on 2020/3/1.
 */
public class SquaresSumTest {
    public static void main(String[] args){
        SolutionA solution=new SolutionA();
        boolean result=solution.judgeSquareSum(3);
        System.out.println(result);
    }

}
class SolutionA {
    public boolean judgeSquareSum(int c) {
       int i=0;
       int j=(int)Math.sqrt(c);
       while(i<=j){
           int k=i*i+j*j;
           if(c==k){
               return  true;
           }else{
               if(c<k){
                   j--;
               }else{
                   i++;
               }
           }
        }
        return false;
    }
}



