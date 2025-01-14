package com.dsaquestions.arraylevel2;

public class Program10 {

    public static int buyAndSellStock(int[] prices) {
       int diff=0;
       int maxDiff=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    diff=prices[j]-prices[i];
                    maxDiff=Math.max(maxDiff,diff);
                }
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));
    }
}
