package com.cydeo;

import com.cydeo.task.dish.Dish;
import com.cydeo.task.dish.DishData;

import java.util.Optional;

public class MatchingAndFindings {
    public static void main(String[] args) {

        // ALL MATCH
        System.out.println("ALL MATCH");
        boolean isHealthy =DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        System.out.println();

        //ANY MATCH
        System.out.println("ANY MATCH");
        if(DishData.getAll().stream()
                .anyMatch(Dish::isVegetarian)) System.out.println("This menu is vegetarian friendly");

        System.out.println();

        // NONE MATCH
        System.out.println("NONE MATCH");
        System.out.println(DishData.getAll().stream()
                .noneMatch(dish -> dish.getCalories() >= 1000));

        System.out.println();

        // FIND ANY
        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        System.out.println();

        // FIND FIRST
        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());

    }
}
