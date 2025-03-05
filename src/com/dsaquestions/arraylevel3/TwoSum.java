package com.dsaquestions.arraylevel3;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        //variation1
//        for (int i = 0; i < arr.length - 2; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println("Yes");
//                    return;
//                }
//            }
//        }
        //variation2
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }
}
