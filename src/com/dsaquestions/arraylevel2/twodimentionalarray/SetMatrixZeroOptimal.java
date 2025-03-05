package com.dsaquestions.arraylevel2.twodimentionalarray;

import java.util.Arrays;

public class SetMatrixZeroOptimal {

    public static void setMatrixZero(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int column0 = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == 0) {
                    //mark the row and column
                    arr[i][0] = 0;
                    if (j == 0) {
                        column0 = 0;
                    } else {
                        arr[0][j] = 0;
                    }
                }
            }
        }
        for (int i = row - 1; i >= 1; i--) {
            for (int j = column - 1; j >= 1; j--) {
                if (arr[i][j] != 0 && (arr[i][0] == 0 || arr[0][j] == 0)) {
                    arr[i][j] = 0;
                }

            }
        }
        //there is and egde-condition as arr[3][3] depends on arr[0][0] so if ar[0][0] changes it will impact the value of arr[3][3]
        if (arr[0][0] == 0) {
            for (int i = 0; i < column; i++)
                arr[0][i] = 0;
        }
        if (column0 == 0) {
            for (int j = 0; j < row; j++) {
                arr[j][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {0, 1, 1, 1}};
        setMatrixZero(arr);
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
