package com.logicalpatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program29 {

    public void pattern(String  str){
        String s=str;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(j==i || j==s.length()-i+1){
                    System.out.print(s.charAt(i-1));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Program29 p = new Program29();
        p.pattern(str);
    }
}
