package com.logicalpatterns;

import java.util.Scanner;

public class Program20 {

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < 2 * (n - i - 1); k++) {
                System.out.print(" ");
            }

                //stars
                for (int j = 0; j <= i; j++) {
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
