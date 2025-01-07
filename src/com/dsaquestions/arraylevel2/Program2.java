package com.dsaquestions.arraylevel2;

public class Program2 {

    public static int[] twoSum(int[] nums, int target) {
        int n= nums.length;;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    nums[0]=i;
                    nums[1]=j;
                    return nums;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
