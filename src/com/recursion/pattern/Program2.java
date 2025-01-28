package com.recursion.pattern;

public class Program2 {

    public void pattern1(int r,int c){
        if(r==0)return;
        if(c<r){
            System.out.print("*");
            pattern1(r,c+1);
        }else{
            System.out.println();
            pattern1(r-1,0);
        }
    }

    public void pattern2(int r,int c){
        if(r==5)return;

        if(c<=r){
            System.out.print("*");
            pattern2(r,c+1);
        }else{
            System.out.println();
            pattern2(r+1,0);
        }
    }
    public static void main(String[] args) {
        Program2 program2=new Program2();
       // System.out.println("hi");
       // program2.pattern1(5,0);
        program2.pattern2(0,0);
    }
}
