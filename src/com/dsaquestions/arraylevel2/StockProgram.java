package com.dsaquestions.arraylevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StockProgram {
    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length-1;i++){

            if(prices[i]<min){
                min=prices[i];
            }
            max= Math.max(max,prices[i]-min);

        }
        return max;

    }

    public static void main(String[] args) {
      int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
