package com.streamsapicoding;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program3 {
    public static void main(String[] args) {
        List<String> listOfNames=List.of("Xavier", "David", "John", "Alice", "Bob", "Jane","Xavi", "Dav", "Joh", "Ali", "Bo", "Ja");

        Map<Character, List<String>> map=listOfNames.stream().collect(Collectors.groupingBy(s -> s.charAt(0), LinkedHashMap::new, Collectors.toList()));
        System.out.println(map);
    }
}
