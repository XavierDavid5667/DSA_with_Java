package com.numberproblems;

import java.util.Scanner;

public class Program5 {

    public static  boolean armstrong(int n){
      int count=0;
      int orginalNumber=n;
      int armstrongNumber=0;

      while(n>0){
          count++;
          n=n/10;
      }

      n=orginalNumber;
      while(n>0){
          int lastDigit=n%10;
          armstrongNumber=armstrongNumber+(int)Math.pow(lastDigit,count);
          n=n/10;
      }
      return armstrongNumber==orginalNumber;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(armstrong(n));
    }
}
