package com.logicalpatterns;

import java.util.Scanner;

public class Program13 {

    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            for(int k=0;k<2*(n-i-1);k++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1);

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        pattern(n);
    }
}