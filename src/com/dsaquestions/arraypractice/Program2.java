package com.dsaquestions.arraypractice;

public class Program2 {

    public static int longestSubArrayWithSumK(int[] arr,int k){
        int maxLength=0;
       for(int i=0;i<arr.length-1;i++){
           int sum=arr[i];
           for(int j=i+1;j<arr.length;j++){
               sum+=arr[j];
               if(sum==k){
                   maxLength=Math.max(maxLength,j-i+1);
               }
           }
       }
       return maxLength;
    }
    public static void main(String[] args) {
      int[] arr={2,3,5,1,9};
        int i = longestSubArrayWithSumK(arr, 10);
        System.out.println(i);
    }
}
