package com.dsaquestions.arraylevel2.twodimentionalarray;

import java.util.Arrays;

public class SetMatixZero {

    public static void setMatrixZeo(int[][] arr) {
        int row = arr.length;
        int colmun = arr[0].length;
        int row1 = 0;
        int column2 = 0;
        for (int i = 0; i < row; i++) {
          for(int j=0;j<colmun;j++){
              if(arr[i][j]==0){
                  row1=i;
                  column2=j;
                  break;
              }
          }
        }
        int i=0;
        int j=0;
        while(i<colmun){
            arr[row1][i]=0;
            i++;
        }
        while (j<row){
            arr[j][column2]=0;
            j++;
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZeo(arr);
        for( int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
