package com.numberproblems;

import java.util.Scanner;

public class Program8 {

    public static int gcd(int n1,int n2){
        int n=Math.min(n1,n2);
        int gcd=0;
        for(int i=n;i>0;i--){
            if(n1%i==0 && n2%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        System.out.println(gcd(n1,n2));

    }
}
