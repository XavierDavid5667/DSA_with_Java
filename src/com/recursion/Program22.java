package com.recursion;

public class Program22 {

    public int prod(int n){
        if(n%10 ==n){
            return n;
        }
        return n%10*prod(n/10);
    }

    public static void main(String[] args) {
        Program22 p = new Program22();
        System.out.println(p.prod(1234));
    }
}
