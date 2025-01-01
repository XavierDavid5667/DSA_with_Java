package com.logicalpatterns;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        for (int i=1;i<=rows;i++){
            for(int j=rows-i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
