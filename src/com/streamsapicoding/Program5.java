package com.streamsapicoding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program5 {
    public static void main(String[] args) {
        String s="XavierDavid";
//        Map<String, Long> collect = s.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);

        String[] split = s.split("");
        String reduce = Arrays.stream(split).reduce("", (a, b) -> a + b);
        System.out.println(reduce);
    }
}
