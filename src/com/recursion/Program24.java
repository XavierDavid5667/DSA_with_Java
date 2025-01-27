package com.recursion;

import java.util.Scanner;

public class Program24 {
    public int countZeroes(int n,int count){
        if(n==0){
            return count;
        }else if(n%10==0){
            return countZeroes(n/10,count+1);
        }else{
            return countZeroes(n/10,count);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Program24 program24=new Program24();
        System.out.println(program24.countZeroes(n,0));
    }
}
