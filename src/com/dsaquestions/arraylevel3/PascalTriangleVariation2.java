package com.dsaquestions.arraylevel3;

import java.util.Scanner;

//Given a row print all binomial coefficients
public class PascalTriangleVariation2 {

    public static void printPascalRow(int row){
        for(int i=0;i<=row;i++){
            System.out.println(binomialCoeff(5,i));
        }
    }
    public static  int binomialCoeff(int n,int r){
        int res=1;
        if(r>n-r){
            r=n-r;
        }
        for(int i=0;i<r;i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println("Enter the row number for the pascal triangle");
        Scanner scanner=new Scanner(System.in);
        int row= scanner.nextInt();
        printPascalRow(row);

    }
}
