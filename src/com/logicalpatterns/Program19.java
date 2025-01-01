package com.logicalpatterns;

import java.util.Scanner;

public class Program19 {
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            char c= (char) ('E'-i);
            for(int j=0;j<=i;j++){
                System.out.print(c+++" ");
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
