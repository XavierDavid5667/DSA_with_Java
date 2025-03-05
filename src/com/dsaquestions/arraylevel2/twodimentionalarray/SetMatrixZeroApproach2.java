package com.dsaquestions.arraylevel2.twodimentionalarray;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroApproach2 {
    public  static  ArrayList<ArrayList<Integer>> removeZeroes(ArrayList<ArrayList<Integer>>arrayList,int row,int column){
        int[] rows=new int[row];
        int[] columns=new int[column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arrayList.get(i).get(j)==0){
                    rows[i]=1;
                    columns[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(rows[i]==1&& columns[j]==1){
                    arrayList.get(i).set(j,0);
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
        ArrayList<ArrayList<Integer>> arrayLists = removeZeroes(arrayList, row, column);
        System.out.println(arrayLists);
    }
}
