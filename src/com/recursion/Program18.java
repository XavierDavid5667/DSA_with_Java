package com.recursion;

import java.util.Scanner;

public class Program18 {
    public void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Program18 program18 = new Program18();
        program18.print(n);
    }
}
