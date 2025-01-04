package com.hashing;

import java.util.Scanner;

//Program to find the frequency of each element
public class Program2 {
    int[] arr;

    public void createArray(int n){
        Scanner scanner=new Scanner(System.in);
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
            System.out.println("Entered "+(i+1)+" element");
        }
    }
    public void findFrequency(){

        boolean[] visted=new boolean[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            if(visted[i]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visted[j]=true;
                    count++;
                }
            }
            System.out.println("Frequency of "+arr[i]+" is "+count);
        }
    }
    public static void main(String[] args) {
        Program2 program2=new Program2();
        program2.createArray(6);
        program2.findFrequency();
    }
}
