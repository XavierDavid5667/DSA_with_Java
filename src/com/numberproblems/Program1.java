package com.numberproblems;

import java.util.Scanner;

public class Program1 {
    public static int countDigits(int n) {
        int count = 0;
        int num = n;
        while (num > 0) {
            int lastNumber = num % 10;
            try {
                if (n % lastNumber == 0) {
                    count++;
                }
            } catch (ArithmeticException ignored) {

            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDigits(n));
    }
}
