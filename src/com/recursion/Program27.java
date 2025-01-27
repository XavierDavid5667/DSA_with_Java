package com.recursion;

public class Program27 {

    public boolean findElement(int[] arr, int i,int target){

        if(i==arr.length-1){
            return  false;
        }
//        if(arr[i]==target){
//            return true;
//        }
//        return findElement(arr,i+1,target);

        return  arr[i]==target || findElement(arr,i+1,target);
    }



    public static void main(String[] args) {
      int[] arr={3,2,1,18,9};
      Program27 obj=new Program27();
      System.out.println(obj.findElement(arr,0,10));
    }
}
