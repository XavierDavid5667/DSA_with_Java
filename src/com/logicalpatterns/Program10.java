package com.logicalpatterns;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=n-1;k>0;k--){
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
