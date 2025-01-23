package com.streamsapicoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {
    public static String concatenate(List<String> s){

        return s.stream().collect(Collectors.joining(",","Xavier","David"));

    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane");
        System.out.println(concatenate(names));
    }

}
