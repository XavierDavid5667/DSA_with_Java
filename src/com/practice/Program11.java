package com.practice;

import java.util.Scanner;

public class Program11 {

    public static void fibonacci(int n) {
        int n1=0;
        int n2=1;
        int n3=0;
        System.out.print(n1+" "+n2);
        for(int i=0;i<n-2;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        fibonacci(n);
    }
}
