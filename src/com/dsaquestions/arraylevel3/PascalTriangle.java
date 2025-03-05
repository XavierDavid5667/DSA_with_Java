package com.dsaquestions.arraylevel3;
import  java.util.*;

public class PascalTriangle {

    public static List<List<Integer>> printPascalTriangle(int n){
        List<List<Integer>>listOfPascalElements=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                list.add(binomialCoeff(i, j));
            }
            listOfPascalElements.add(list);

        }
        return  listOfPascalElements;
    }
    public static  int binomialCoeff(int n,int r){
        int res=1;
        if(r>n-r){
            r=n-r;
        }
        for(int i=0;i<r;i++){
            res*=n-i;
            res/=(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
      int n=5;
        List<List<Integer>> list = printPascalTriangle(5);
        for(List<Integer>l:list){
            System.out.println(l);
        }

    }
}
