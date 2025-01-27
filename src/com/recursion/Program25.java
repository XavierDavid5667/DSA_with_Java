package com.recursion;

import java.util.Scanner;

public class Program25 {
    public int numberOfSteps(int num){
      int count=0;
        int i = countSteps(num, count);
        return i;
    }

    public int countSteps(int num,int count) {

        if(num==0){
            return count;
        }
        if(num%2==0){
           return countSteps(num/2,count+1);
        }else{
         return   countSteps(num-1,count+1);
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        Program25 program25=new Program25();
        System.out.println(program25.numberOfSteps(num));
    }
}
