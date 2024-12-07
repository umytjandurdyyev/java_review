package com.cydeo.doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

        // ClassName :: method

        // Reference to static method
        Calculate s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(10, 20);

        Calculate s2 = Calculator :: findSum;
        s2.calculate(10, 20);

        // Reference to instance method
        Calculate m1 = (x, y) -> new Calculator().findMultiply(x, y);
        m1.calculate(10, 20);

        Calculate m2 = new Calculator() :: findMultiply;
        m2.calculate(10, 20);

        // Functional interface
        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        System.out.println(fn.apply("Developer ", 6));

        BiFunction<String, Integer, String> fn2 = String :: substring;
        System.out.println(fn2.apply("Developer ", 6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(20);

         BiFunction<MyClass, Integer, Double> v2 = MyClass::method;
         BiFunction<String, String, String> v3 = String::concat;
    }
}
