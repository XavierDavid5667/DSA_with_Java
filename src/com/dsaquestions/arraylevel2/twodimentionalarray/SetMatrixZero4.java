package com.dsaquestions.arraylevel2.twodimentionalarray;

import java.util.Arrays;

public class SetMatrixZero4 {
    public static int[][] setMatrixZero(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int[] rowArray = new int[row];
        int[] columnArray = new int[column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == 0) {
                    rowArray[i] = 1;
                    columnArray[j] = 1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (rowArray[i] == 1 || columnArray[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZero(arr);
        for( int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
