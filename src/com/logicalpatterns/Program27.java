package com.logicalpatterns;

import java.util.Scanner;

public class Program27 {
    public static  void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i+1;k<=n;k++) {
                System.out.print(k);
                System.out.print(" ");
            }
                for(int j=0;j<i;j++){
                    System.out.print(" ");
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
