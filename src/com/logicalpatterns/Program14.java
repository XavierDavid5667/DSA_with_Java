package com.logicalpatterns;

import java.util.Scanner;

public class Program14 {
    public static void pattern(int n){
        int count=0;
        for (int i =0; i<n; i++) {
            for (int j =0; j<=i; j++) {
                System.out.print(++count+" ");
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
