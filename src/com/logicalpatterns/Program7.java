package com.logicalpatterns;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
