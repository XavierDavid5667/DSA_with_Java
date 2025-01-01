package com.logicalpatterns;

import java.util.Scanner;

public class Program21 {

    public static void pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            int spaces = 2 * (n - i);
            if (i > n) {
                stars = (2 * n) - i;
                spaces = 2 * (i - n);

            }
            //stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern(n);

    }
}
