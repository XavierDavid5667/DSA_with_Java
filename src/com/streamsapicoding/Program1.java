package com.streamsapicoding;


public class Program1 {

    public static String reverse(String s) {

        return s.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> b + a);
    }
    public static void main(String[] args) {

        String s = "hello";
        System.out.println(reverse(s));
    }
}
