package com.logicalpatterns;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        for (int i=1;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
