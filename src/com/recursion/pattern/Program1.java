package com.recursion.pattern;

public class Program1 {

    public static void pattern(int n){

        //base condition
        if(n<=0)return;

        for(int i=n;i>0;i--){
            System.out.print("*");
        }
        System.out.println();
        pattern(n-1);
    }
    public static void main(String[] args) {
       pattern(5);
    }
}
