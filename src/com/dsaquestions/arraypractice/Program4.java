package com.dsaquestions.arraypractice;

public class Program4 {

    public static int maxLengthSubArray(int[] arr,int k){
        int sum=0;
        int maxLength=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLength=Math.max(maxLength,i-j+1);
            }
            if(sum>k){
                while(sum>k && j<i){
                    sum=sum-j;
                    j++;
                }
            }
        }
        return maxLength;

    }


    public static void main(String[] args) {
      int[] arr={1,2,3,1,1,1,1,3,3};
        int i = maxLengthSubArray(arr, 6);
        System.out.println(i);
    }
}
