package com.dsaquestions.arraylevel2;

public class RotateArrayApproach2 {

    public int[][] rotate(int[][] arr){
        int n=arr.length;
        int[][] newArray=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                newArray[j][n-i-1]=arr[i][j];
            }
        }
        return newArray;
    }
    public static void main(String[] args) {

    }
}
