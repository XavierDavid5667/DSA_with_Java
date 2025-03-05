package com.dsaquestions.arraylevel2;

public class LongestSubsequenceBruteForce {

    public static int longestSubSequece(int[] arr){
        int maxCount =1;
        for(int i=0;i< arr.length;i++){
            int count=1;
            int x=arr[i];
            x=x+1;
            while(numberExists(arr,x)){
                count+=1;
                x=x+1;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }

    public static boolean numberExists(int[] arr, int num){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
      int[] arr={100, 200, 1, 3, 2, 4};
        int i = longestSubSequece(arr);
        System.out.println(i);


    }
}
