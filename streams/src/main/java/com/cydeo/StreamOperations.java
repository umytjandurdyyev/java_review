package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,5,3,7,8,5,2);
//        myList.forEach(x -> System.out.println(x));
        myList.forEach(System.out::println);

        System.out.println("************** filter() **********************");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        System.out.println("************** distinct() **********************");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("************** limit(n) **********************");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("************** skip(n) **********************");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("************** map() **********************");
        myList.stream()
                .map(val -> val * 2)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);

        System.out.println("TASK");
        List<String> word = Arrays.asList("JAVA", "APPLE","HONDA","DEVELOPER");
        word.stream()
                .map(num -> num.length())
                .forEach(System.out::println);

    }
}
