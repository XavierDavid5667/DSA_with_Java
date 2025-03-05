package com.dsaquestions.arraylevel2;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArrayApproach2 {

    public static List<Integer> leader(int[] arr) {
        List<Integer>listOfLeaders=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader=false;
                    break;
                }
            }
            if(leader){
                listOfLeaders.add(arr[i]);
            }
        }
        return listOfLeaders;
    }

    public static void main(String[] args) {
        List<Integer> leader = leader(new int[]{10, 22, 12, 3, 0, 6});
        System.out.println(leader);

    }
}
