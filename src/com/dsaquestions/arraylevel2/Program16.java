package com.dsaquestions.arraylevel2;

import java.util.*;

public class Program16 {

    public static int nextPermutation(int[] arr) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            number.append(arr[i]);
        }
        int num = Integer.parseInt(number.toString());
        List<Integer> list = new ArrayList<>();
        list.add(num);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                StringBuilder number1 = new StringBuilder();
                for (int value : arr) {
                    number1.append(value);
                }
                int num1 = Integer.parseInt(number1.toString());
                if (!list.contains(num1)) {
                    list.add(num1);
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        for (Integer i : list) {
            if (i > num) {
                return i;
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println(nextPermutation(arr));
    }
}
