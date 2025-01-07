package com.dsaquestions.array;

public class Program8 {

    public static int[] rotate(int[] arr, int d, int n) {
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - n + d];
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
