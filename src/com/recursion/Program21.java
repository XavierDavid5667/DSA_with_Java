package com.recursion;

import java.util.Scanner;

public class Program21 {

    public int sum1(int n,int sum) {
        if(n==0) {
            return sum;
        }
        return sum1(n/10,sum+n%10);
    }

    public int sum2(int n) {
        if(n==0) {
            return 0;
        }
        return n%10+sum2(n/10);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Program21 program21=new Program21();
        System.out.println(program21.sum2(n));
    }
}
