package com.cydeo;

import java.util.HashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Sergey");
        map.put(2,"Abraham");
        map.put(3,"Olha");
        map.put(4,"Aliya");

        System.out.println(map.get(3));

        System.out.println(firstNonRepeatingChar("cydeo java developer"));
    }

    // Find the first non-repeating char in a string

    public static Character firstNonRepeatingChar(String str) {
        // 1. Create HashMap
        Map<Character, Integer> map = new HashMap<>();
        //for counting chars
//        int count;

        // 2. Iterate over the string
        // counting chars and putting values in the hashMap
        for (Character ch : str.toCharArray()) {
//            if(map.containsKey(ch)){
//                count = map.get(ch);
//                map.put(ch, count + 1);
//            }else map.put(ch, 1);
            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        // 3. starting from string, check if the char count equals 1
        for (Character ch : str.toCharArray()) {
            if (map.get(ch) == 1) return ch;
        }
        return Character.MIN_VALUE;
    }
}
