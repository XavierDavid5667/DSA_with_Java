package com.streamsapicoding;

import java.util.List;

public class Program7 {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Character character = input.chars().mapToObj(c -> (char) c).filter(c -> input.indexOf(c) == input.lastIndexOf(c)).findFirst().orElse(null);
        System.out.println(character);
    }
}
