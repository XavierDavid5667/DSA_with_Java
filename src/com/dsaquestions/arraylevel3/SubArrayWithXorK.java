package com.dsaquestions.arraylevel3;

public class SubArrayWithXorK {

    public static int maxSubArray(int[] arr,int target){
        int n=arr.length;
        int maxLength=Integer.MIN_VALUE;
        int count=0;
        for (int i=0;i<n;i++){
            int xor=0;
            for(int j=i;j<n;j++){
                xor^=arr[j];
                if(xor==target){
                   // maxLength=Math.max(maxLength,j-i+1);
                    count++;
                }
            }
        }
        return count;

    }


    public static void main(String[] args) {
       int[] arr={5, 6, 7, 8, 9};
        int i = maxSubArray(arr, 6);
        System.out.println(i);
    }
}
