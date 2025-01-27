package com.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program23 {

    public int reverse(int n,int reverse){
        if(n==0){
            return reverse;
        }
        reverse=reverse*10+n%10;
        return reverse(n/10,reverse);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        Program23 program23=new Program23();
        int n=Integer.parseInt(bufferedReader.readLine());
        System.out.println(program23.reverse(n,0));
    }
}
