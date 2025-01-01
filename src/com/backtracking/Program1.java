package com.backtracking;

import java.util.Scanner;

// print from 1 to N using recursion
public class Program1 {

    public static void print(int i) {
        if (i < 1) {
            return;
        }
        print(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();
        print(i);
    }
}
