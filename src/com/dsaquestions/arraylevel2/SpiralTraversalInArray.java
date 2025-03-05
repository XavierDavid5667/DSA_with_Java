package com.dsaquestions.arraylevel2;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalInArray {

    public static  List<Integer> traverse(int[][] arr) {
        int top = 0;
        int right = arr[0].length-1;
        int bottom = arr.length-1;
        int left = 0;
        List<Integer> finalList = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <=right; i++) {
                finalList.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <=bottom; i++) {
                finalList.add(arr[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    finalList.add(arr[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    finalList.add(arr[i][left]);
                }
                left++;
            }

        }
        return finalList;
    }

    public static void main(String[] args) {
       int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> traverse = traverse(arr);
        System.out.println(traverse);
    }
}
