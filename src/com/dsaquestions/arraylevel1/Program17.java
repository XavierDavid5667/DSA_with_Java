package com.dsaquestions.array;

public class Program17 {
    public static int findMax(int[] arr,int k) {
        int maxLength=0;
        int sum=0;
        int len;
        int n= arr.length;;
        for(int i=0;i<n;i++){
            sum=arr[i];
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    len=j-i+1;
                    maxLength=Math.max(maxLength,len);
                    break;
                }
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {
     int[] arr={2,3,5};
     int k=5;
     System.out.println(findMax(arr,k));
    }
}
