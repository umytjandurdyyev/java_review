package com.cydeo;

import com.cydeo.task.dish.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        System.out.println(numbers.stream()
                .reduce(0, (x, y) -> x + y));

        System.out.println();

        // No initial value
        Optional result = numbers.stream()
                .reduce((x, y) -> x + y);
        System.out.println(result.get());

        System.out.println();

        //Max and Min
        System.out.println("MIN: " + numbers.stream()
                .reduce(Integer::min).get());
        System.out.println();
        System.out.println("MAX: " + numbers.stream()
                .reduce(Integer::max).get());
        System.out.println();
        System.out.println("SUM: " + numbers.stream()
                .reduce(Integer::sum).get());

        System.out.println();

        // Count the number of dishes using the map and reduce
        System.out.println(DishData.getAll().stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b));

        System.out.println(DishData.getAll().stream().count());
    }
}
