package com.logicalpatterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
      for(int i=1;i<=rows;i++){
          for(int j=1;j<=i;j++){
              System.out.print(j+" ");
          }
          System.out.println();
      }
    }
}
