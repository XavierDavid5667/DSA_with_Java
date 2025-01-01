package com.recursion;

import java.util.Scanner;

public class Program3 {
    public void printNumberNTimes(int i,int n){
        if(i>n){
            return ;
        }
        System.out.println(i);
        i=i+1;
        printNumberNTimes(i,n);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Program3 program3=new Program3();
        program3.printNumberNTimes(1,n);

    }
}
