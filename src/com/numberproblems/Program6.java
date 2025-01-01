package com.numberproblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program6 {

    public static List<Integer> factors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != Math.sqrt(n)) {
                    list.add(n / i);
                }
            }

        }
        return list.stream().sorted(Comparator.naturalOrder()).toList();
    }
        public static void main (String[]args){
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            System.out.println(factors(n));
        }
    }
