package com.dsaquestions.arraylevel2;

public class Program9 {

    public static int maximumSubArraySum(int[] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubArraySum(arr));
    }
}
