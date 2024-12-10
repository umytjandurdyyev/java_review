package com.cydeo.task.dish;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        System.out.println("Print all dish's name that has less than 400");
        // Print all dish's name that has less than 400
        DishData.getAll().stream()
                .filter(cal -> cal.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("============================================");
        System.out.println("Print the length of the name of each dish");
        // Print the length of the name of each dish
        DishData.getAll().stream()
                .map(name -> name.getName().length())
                .forEach(System.out::println);

        System.out.println("============================================");
        System.out.println("Print three high caloric dish name");
        // Print three high caloric dish name
        DishData.getAll().stream()
                .filter(cal -> cal.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("============================================");
        System.out.println("Print all dish name that are below 400 calories in sorted");
        // Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(cal -> cal.getCalories() < 400)
                .sorted(comparing(Dish::getCalories)) // reversed()
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
