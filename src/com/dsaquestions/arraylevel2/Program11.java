package com.dsaquestions.arraylevel2;

public class Program11 {

    public static int buyAndSellStock(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        int diff=0;
        for(int i=0;i<prices.length;i++){
          if(prices[i]<minPrice){
              minPrice=prices[i];
          }
          diff=prices[i]-minPrice;
          maxProfit=Math.max(maxProfit,diff);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));
    }
}
