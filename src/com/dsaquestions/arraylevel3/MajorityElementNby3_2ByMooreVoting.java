package com.dsaquestions.arraylevel3;

import java.util.ArrayList;
import java.util.List;

/**
 * Used Moore's voting alogorithm
 */
public class MajorityElementNby3_2ByMooreVoting {

    public List<Integer> getMajorityElement(int[] arr) {
        List<Integer>temp=new ArrayList<>();
        int element1 = 0;
        int count1 = 0;
        int element2 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count1 == 0 && arr[i]!=element2) {
                element1 = arr[i];
                count1 = 1;
            }
            else if (count2 == 0 && arr[i]!=element1) {
                element2 = arr[i];
                count2 = 1;
            }
            else if (element1 == arr[i]) {
                count1++;
            }
            else if (element2 == arr[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int newCount1=0;
        int newCOunt2=0;

        for(int i=0;i<arr.length;i++){
            if(element1==arr[i]){
                newCount1++;
            }else if(element2==arr[i]){
                newCOunt2++;
            }
        }
        int minLength=(arr.length/3)+1;
        if(newCount1>minLength){
            temp.add(element1);
        }
        if(newCOunt2>minLength){
            temp.add(element2);
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}
