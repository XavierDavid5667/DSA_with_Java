package com.dsaquestions.arraylevel2;

import java.util.Arrays;

public class RotateArrayBruteforce {
    /**
     * [[1,2,3],[4,5,6],[7,8,9]]
     *
     * Output
     * : [[7,4,1],[8,5,2],[9,6,3]]
     */
     public static int[][] rotate(int[][] array){
         int row=array.length;
         int column=array[0].length;
         int[][] arr=new int[row][column];
         for(int i=0;i<column;i++) {
             for (int j = row - 1; j >= 0; j--) {
               arr[i][2-j] = array[j][i];
             }
         }
         return arr;

     }
    public static void main(String[] args) {
      int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotate = rotate(arr);
        for (int[] ints : rotate) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
