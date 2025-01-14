package com.practice;

import java.util.*;

public class Program3 {
    public static List<Character> getUniqueCharacters(String word) {
        String[] array = word.split("\\s");
        Map<Character, Integer> hashMap = new HashMap<>();
        for (String s : array) {
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    hashMap.put(c, 1);
                }
            }
        }
        List<Character> list = new ArrayList<>();
        List<Map.Entry<Character, Integer>> list1 = hashMap.entrySet().stream().filter(entry -> entry.getValue() == 1).toList();
        for (Map.Entry<Character, Integer> entry : list1) {
            list.add(entry.getKey());
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        System.out.println(getUniqueCharacters(word));
    }
}
