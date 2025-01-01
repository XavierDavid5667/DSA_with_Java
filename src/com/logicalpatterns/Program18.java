package com.logicalpatterns;

import java.util.Scanner;

public class Program18 {

    public static void pattern(int n){
        for(int i=0;i<n;i++){

            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char c='A';
            int breakpoint=(2*i+1)/2;
            for(int k=0;k<2*i+1;k++){
                if(k<i){

                    System.out.print(c++);
                }else {
                    System.out.print(c--);
                }

            }
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern(n);
    }
}
