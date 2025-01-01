package com.logicalpatterns;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n){
                stars=2*n-i;
            }
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
