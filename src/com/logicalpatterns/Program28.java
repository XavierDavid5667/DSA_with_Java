package com.logicalpatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program28 {

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(2 * j - 1+" ");
                }
            } else {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print(2 * j+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Program28 program28 = new Program28();
        program28.printPattern(n);
    }
}
