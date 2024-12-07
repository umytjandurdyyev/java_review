package com.cydeo.functionalinterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        // ********************PREDICATE********************** boolean test(T t);
        System.out.println("===============PREDICATE=============");
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

        Predicate<Integer> pred = p -> p % 2 == 0 ? true: false;
        System.out.println(pred.test(13));

        // ********************CONSUMER********************** void accept(T t);
        System.out.println("================CONSUMER================");
        Consumer<Integer> display = integer -> System.out.println(integer);
        display.accept(20);

        System.out.println("================BiCONSUMER================");
        // ********************BiCONSUMER********************** void accept(T t, U u);
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(12, 23);

        System.out.println("================FUNCTION================");
        // ********************FUNCTION********************** R apply(T t);
        Function<String, String> fun = str -> "Hello " + str;
        System.out.println(fun.apply("Umytjan"));

        // ********************SUPPLIER********************** T get();
        System.out.println("================SUPPLIER================");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}
