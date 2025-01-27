package com.recursion;

public class Program20 {
    public int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Program20 program20 = new Program20();
        int fact = program20.fact(5);
        System.out.println(fact);
    }
}