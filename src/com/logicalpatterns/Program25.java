package com.logicalpatterns;

import java.util.Scanner;

public class Program25 {

    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-2*i+1;j++){
                System.out.print("*");
            }
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Program25 program25=new Program25();
        program25.pattern(n);
    }
}
