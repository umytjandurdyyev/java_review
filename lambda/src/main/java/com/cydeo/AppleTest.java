package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(Color.GREEN, 300));
        inventory.add(new Apple(Color.RED, 500));
        inventory.add(new Apple(Color.GREEN, 100));
        inventory.add(new Apple(Color.BLUE, 150));

//        AppleHeavyPredicate heavy = new AppleHeavyPredicate();
        // you don't have to wright long just paste the "heavy" -> new AppleHeavyPredicate
        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);

//        List<Apple> applesCharacter = prettyPrintApple(inventory);

    }

    private static void prettyPrintApple(List<Apple> inventory, ApplePredicate applePredicate) {
    }

    // It needs to be applicable to both heavy and green requirements -> it should be ApplePredicate (Interface)
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
