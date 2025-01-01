package com.recursion;

import java.util.Scanner;

public class Program2 {

    public void printName(int i,int n){
         if(i>n){
             return ;
         }
        System.out.println("Xavier");
         i=i+1;
         printName(i,n);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Program2 program2=new Program2();
        program2.printName(1,n);
    }
}
