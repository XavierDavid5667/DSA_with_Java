package com.streamsapicoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Program6 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> set = new HashSet<>();
        List<Integer> collect = myList.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
        System.out.println(collect);

    }
}
