package com.cydeo;

import com.cydeo.task.dish.*;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        // toCollection(Supplier) : is used to create a collection using collector
        // toCollection() needs lambda expression
        System.out.println("********toCollection()***********");
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new)); // "new" constructor reference --> new ArrayList
        // we didn't use terminal operation because we are holding it, and we can manipulate with it
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println();

        //toList() : returns a Collector interface that gathers the input data into a new list
        System.out.println("********toList()***********");
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println();

        //toSet() : returns a Collector interface that gathers the input data into a new set
        System.out.println("********toSet()***********");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println();

        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        System.out.println("********toMap()***********");
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        System.out.println();

        //counting() : returns a Collector that counts the number of the elements
        System.out.println("********counting()***********");
        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println();

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of an integer-valued func
        System.out.println("********summingInt()***********");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println();

        System.out.println("********averagingInt()***********");
        //averagingInt(ToIntFunction) : returns the average of the integers passed values
        Double calorieAvg =  DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAvg);

        System.out.println();

        //joining() : is used to join various elements of a character or string array into a single string object
        System.out.println("********joining()***********");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str =  courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println();

        //partitioningBy() : is used to partition a stream of objects(or set of elements) based on a given predicate
        System.out.println("********partitioningBy()***********");
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println();

        //groupingBy() : is used for grouping objects by some property and storing results in a map instance
        System.out.println("********groupingBy()***********");
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);
    }
}
