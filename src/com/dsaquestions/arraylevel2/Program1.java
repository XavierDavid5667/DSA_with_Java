package com.dsaquestions.arraylevel2;

public class Program1 {

    public static String twoSum(int[] arr ,int target) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return "Yes";
                }
            }
        }
        return "No";
    }
    public static void main(String[] args) {
    int[] arr={2, 6, 5, 8, 11};
    int target=14;
    System.out.println(twoSum(arr,target));
    }
}
