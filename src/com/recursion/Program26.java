package com.recursion;

public class Program26 {

    public boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return isSorted(arr,i+1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,8,4,9,12};
        Program26 obj=new Program26();
        System.out.println(obj.isSorted(arr,0));
    }
}
