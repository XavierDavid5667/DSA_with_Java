package com.dsaquestions.arraylevel3;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public List<Integer> findMajorityElement(List<Integer>list){
        int n=list.size();
        List<Integer>newList=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(list.get(i)==list.get(j) && !newList.contains(list.get(i))){
                    count++;
                }
            }
            if(count>n/3){
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public static void main(String[] args) {

    }
}
