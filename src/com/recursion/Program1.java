package com.recursion;

public class Program1 {

    private static int count=0;
    public static void count() {
        System.out.println(count++);
        if(count>10){
            return;
        }
        count();

    }
    public static void main(String[] args) {
        count();
    }
}
