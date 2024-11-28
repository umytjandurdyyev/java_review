package com.cydeo;

import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        // 1. create set
        Set<Student> mySet = new HashSet<>();

        // 2. add elements
        mySet.add(new Student(7, "Jacob"));
        mySet.add(new Student(1, "Ahkmed"));
        mySet.add(new Student(3, "Mira"));
        mySet.add(new Student(6, "Karen"));
        mySet.add(new Student(8, "Arne"));
        mySet.add(new Student(8, "Arne")); // to prevent duplicate we need to implement hashCode and equals

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();

        numSet.add(1);
        numSet.add(2);
        numSet.add(3);

        System.out.println(numSet);
        System.out.println(numSet.add(3));

        System.out.println("first repeating: "+firstRepeatingChar("Java Developer"));

    }
    // Find the first repeating char in a string "Java Developer"

    public static Character firstRepeatingChar(String str) {
        // Create a hashMap
        Set<Character> chars = new HashSet<>();

        // Iteration return ch if add returns false
        for (Character ch : str.toCharArray()) if (!chars.add(ch)) return ch;
        return null; // return null if no repeating char found
    }

}
