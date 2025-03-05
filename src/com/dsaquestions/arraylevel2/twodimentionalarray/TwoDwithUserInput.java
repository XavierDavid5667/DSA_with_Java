package com.dsaquestions.arraylevel2.twodimentionalarray;

import java.util.Scanner;

public class TwoDwithUserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=scanner.nextInt();
        System.out.println("Enter the columns");
        int columns=scanner.nextInt();
        int[][] arr=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
