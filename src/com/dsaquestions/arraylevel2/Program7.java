package com.dsaquestions.arraylevel2;

public class Program7 {
    public int maximumSubArraySum(int[] arr){
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){

               // for(int k=i;k<=j;k++){
                    sum+=arr[j];
             //   }
                if(sum>max) {
                    max = sum;
                }

            }

        }
        return max;
    }
    public static void main(String[] args) {
    int[] arr={-2,1,-3,4,-1,2,1,-5,4};
    Program7 program7=new Program7();
    System.out.println(program7.maximumSubArraySum(arr));
    }
}
