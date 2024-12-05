package com.cydeo.functionalinterfaces;

import java.util.function.Predicate;

public class Examples {

    public static void main(String[] args) {

        // ********************PREDICATE********************** boolean test(T t);
        // Anonymous class
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 18;
//            }
//        };
//
//        lesserThan.test(50);

        // implementation of the test method, which belongs to functional interface
        Predicate<Integer> lesserThan = integer -> integer > 19;
        // print
        System.out.println(lesserThan.test(20));

    }
}
