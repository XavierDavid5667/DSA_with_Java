package com.dsaquestions.arraylevel2.twodimentionalarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZero2 {

    private static void markRow(ArrayList<ArrayList<Integer>> arrayList, int row, int column, int i) {
        for (int k = 0; k < column; k++) {
            if (arrayList.get(i).get(k) != 0) {
                arrayList.get(i).set(k, -1);
            }
        }
    }

    private static void markColumn(ArrayList<ArrayList<Integer>> arrayList, int row, int column, int j) {
        for (int i = 0; i < column; i++) {
            if (arrayList.get(i).get(j) != -0) {
                arrayList.get(i).set(j, -1);
            }
        }
    }

    public  static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> arrayList, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arrayList.get(i).get(j) == 0) {
                    markRow(arrayList, row, column, i);
                    markColumn(arrayList, row, column, j);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arrayList.get(i).get(j) == -1) {
                    arrayList.get(i).set(j, 0);
                }
            }
        }

        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        arrayList.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        arrayList.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int row=arrayList.size();
        int column=arrayList.get(0).size();
        ArrayList<ArrayList<Integer>> arrayLists = zeroMatrix(arrayList, row, column);
        System.out.println(arrayLists);

    }
}
