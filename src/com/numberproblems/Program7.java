package com.numberproblems;

import java.util.Scanner;

public class Program7 {

    public static boolean isPrime(int n){
        int count=0;
        int sqrNumber=(int)Math.sqrt(n);
        for(int i=1;i<=sqrNumber;i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
        }
        return count == 2;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(isPrime(n));
    }
}
