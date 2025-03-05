package com.dsaquestions.arraylevel2.twodimentionalarray;

import java.util.Arrays;

public class SetMatrixZero5 {

    public static int[][] setMatrixZero(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int column0=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == 0) {
                    if(j==0){
                        column0=1;
                        arr[i][0] = 1;
                        continue;
                    }
                    arr[i][0] = 1;
                    arr[0][j] = 1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(j==0){
                    if(column0==1){
                        arr[i][j]=0;
                    }
                }
                if (arr[i][0] == 1 || arr[0][j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] ints = setMatrixZero(arr);
        for(int i=0;i< args.length;i++){
            System.out.println(Arrays.toString(ints[i]));
        }
    }
}
