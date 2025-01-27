package com.recursion;

import java.util.Scanner;

public class Program19 {

    public void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Program19 program19 = new Program19();
        program19.print(n);
    }
}
