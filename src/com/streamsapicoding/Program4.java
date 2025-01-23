package com.streamsapicoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program4 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 17),
                new Person("Charlie", 30)
        );

        Map<Boolean, List<Person>> collect =  people.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 18, Collectors.toList()));
       collect.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
    }
}
