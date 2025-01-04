package com.dsaquestions.array;

public class Program14 {

    public static int missingNumber(int []a, int N){
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=N;i++) {
            xor1 = xor1 ^ i;
        }
        for(int i=0;i<a.length;i++) {
            xor2 = xor2 ^ a[i];
        }
        return xor1 ^ xor2;

    }
    public static void main(String[] args) {
        int N = 5;
        int a[] = {1, 2, 4, 5};
        System.out.println(missingNumber(a,N));

    }
}
