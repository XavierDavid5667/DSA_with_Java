package com.dsaquestions.arraylevel2.twodimentionalarray;

import java.util.Arrays;
import java.util.List;

public class SetMatrixZero1 {

    public static int[][] setMatrixZero(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == 0) {
                    int row1 = i;
                    int column1 = j;
                    for (int k = 0; k < column; k++) {
                        if (arr[row1][k] != 0) {
                            arr[row1][k] = -1;
                        }
                    }
                    for (int l = 0; l < row; l++) {
                        if (arr[l][column1] != 0) {
                            arr[l][column1] = -1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] ints = setMatrixZero(arr);
        int row = arr.length;
        int column = arr[0].length;
        for( int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}