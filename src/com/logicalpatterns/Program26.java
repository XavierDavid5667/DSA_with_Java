package com.logicalpatterns;

import java.util.Scanner;

public class Program26 {

    public void pattern(int n,int columns) {
        int stars=columns;
        for (int i = 1; i <= n; i++) {
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            if(i>=(n/2)+1){
                stars++;
            }else {
                stars--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int columns = scanner.nextInt();
        Program26 program26 = new Program26();
        program26.pattern(n,columns);

    }
}
