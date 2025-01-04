package com.hashing;

import java.util.Scanner;

public class Program1 {

    int[] arr;

    int[] hash;

    public  void createArray(int n){
        Scanner scanner=new Scanner(System.in);
        arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]= scanner.nextInt();
           System.out.println("Entered "+(i+1)+" element");
       }
    }

    public void preCompute(){
        hash=new int[13];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("preCompute done");
    }

    public int fetch(int key){
        return hash[key];
    }

    public static void main(String[] args) {
        Program1 program1=new Program1();
        program1.createArray(5);
        program1.preCompute();
        System.out.println("Enter the key to be searched");
        Scanner scanner=new Scanner(System.in);
        int key=scanner.nextInt();
        System.out.println(program1.fetch(key));
    }
}
