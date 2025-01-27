package com.recursion;

public class Program15 {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Program15 program15 = new Program15();
        System.out.println(program15.factorial(5));
    }

}
