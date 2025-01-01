package com.recursion;

import java.util.Scanner;

public class Program8 {
    public static int sum(int i){
        if(i==0){
            return 0;
        }
        return i+sum(i-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum(n));
    }
}
