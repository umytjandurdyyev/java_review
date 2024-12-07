package com.cydeo.apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(Color.GREEN, 300));
        inventory.add(new Apple(Color.RED, 500));
        inventory.add(new Apple(Color.GREEN, 100));
        inventory.add(new Apple(Color.BLUE, 150));

//        AppleHeavyPredicate heavy = new AppleHeavyPredicate();
        // you don't have to wright long just paste the "heavy" -> new AppleHeavyPredicate
//        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
//        System.out.println(heavyApple);
//
//        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
//        System.out.println(greenApple);

        List<Apple> greenApple = filterApples(inventory, apple -> apple.getColor() == Color.GREEN);
        System.out.println(greenApple);
        prettyPrintApple(inventory,new AppleSimpleFormatter());
        prettyPrintApple(inventory,new AppleFancyFormatter());

//        List<Apple> applesCharacter = prettyPrintApple(inventory);

    }

    private static void prettyPrintApple(List<Apple> inventory, AppleFormatter appleFormatter) {
        for(Apple apple : inventory){
            System.out.println(appleFormatter.accept(apple));
        }
    }

    // It needs to be applicable to both heavy and green requirements -> it should be ApplePredicate (Interface)
//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
//        List<Apple> result = new ArrayList<>();
//
//        for(Apple apple : inventory){
//            if(applePredicate.test(apple)){
//                result.add(apple);
//            }
//        }
//        return result;
//    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> applePredicate) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
