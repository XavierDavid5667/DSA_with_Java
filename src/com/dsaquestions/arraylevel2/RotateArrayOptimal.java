package com.dsaquestions.arraylevel2;

import java.util.Arrays;

public class RotateArrayOptimal {

    public static int[][] rotate(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for( int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("After transpose of matrix");
        for(int[] ar:arr){
            System.out.println(Arrays.toString(ar));
        }
        System.out.println("========================");
        System.out.println("Reversing every row");
        for(int i=0;i<n;i++){
            int left=0;
            int right=arr[0].length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] rotate = rotate(arr);
        for(int[] a:rotate){
            System.out.println(Arrays.toString(a));
        }
    }
}
