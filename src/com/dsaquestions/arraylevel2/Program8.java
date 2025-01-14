package com.dsaquestions.arraylevel2;

public class Program8 {
    public static int maxSumSubarray(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            sum+=i;
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
     int[] arr={-1, -4, -5};
     System.out.println(maxSumSubarray(arr));
    }
}
