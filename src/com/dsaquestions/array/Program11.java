package com.dsaquestions.array;

public class Program11 {
    public static int linearSearch(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int num = 4;
        System.out.println(linearSearch(arr,num));
    }
}
