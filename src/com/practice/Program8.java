package com.practice;

public class Program8 {

    /**
     *
     * @param prices
     * @return
     */
    public static int buyAndSellStock(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=-1;
        int diff=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            diff=prices[i]-min;
            maxProfit=Math.max(maxProfit,diff);

        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));

    }
}
