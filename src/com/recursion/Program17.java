package com.recursion;

import java.util.Scanner;

public class Program17 {
    public  void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Program17 program17=new Program17();
        program17.print(n);
    }
}
