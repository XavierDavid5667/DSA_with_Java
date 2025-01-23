package com.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program14 {

    public int sum(int n){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        Program14 program14=new Program14();
        int n=Integer.parseInt(bufferedReader.readLine());
        System.out.println(program14.sum(n));
    }
}
