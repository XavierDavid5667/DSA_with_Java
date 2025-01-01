package com.logicalpatterns;

import java.util.Scanner;

public class Program16 {

    public static void pattern(int n){
        for(int i=n;i>0;i--){
            char c='A';
            for(int j=0;j<i;j++){
                System.out.print(c++);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        pattern(n);
    }

}
