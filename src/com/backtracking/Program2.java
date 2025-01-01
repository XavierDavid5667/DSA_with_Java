package com.backtracking;


import java.util.Scanner;

//print from N to 1 using backtracking
public class Program2 {

    public static void printNto1(int i,int n ){
        if(i>n){
            return;
        }
        printNto1(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        int n= scanner.nextInt();
        printNto1(i,n);
    }
}
