package com.logicalpatterns;

import java.util.Scanner;

public class Program12 {

    public  static void pattern(int n){
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                flag=!flag;
                if(flag){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
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
