package com.cydeo.task.character;

import java.util.Arrays;
import java.util.List;

public class TaskCharacter {
    public static void main(String[] args) {

        System.out.println("TASK");
        List<String> word = Arrays.asList("JAVA", "APPLE","HONDA","DEVELOPER");
        word.stream()
                .map(num -> num.length())
                .forEach(System.out::println);

        System.out.println("Double colon");
        word.stream()
                .map(String::length)
                .forEach(System.out::println);

    }
}
