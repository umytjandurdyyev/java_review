package com.cydeo.comparatorinterface;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Integer> items = Arrays.asList(52,12,14,34,41,62);
        System.out.println(items);

        Collections.sort(items);
        System.out.println(items);

        // Desc order
        Collections.sort(items, new MyComparator());
        System.out.println(items);

        Collections.sort(items, ((o1, o2) -> (o1 > o2) ? -1 : (o2 > o1) ? 1 : 0));

        //Ascending order
        items.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(items);

        //Descending order
        items.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(items);

        // Sorting
        List<Apple> myInventory = Arrays.asList(
                new Apple(Color.GREEN, 84),
                new Apple(Color.BLUE, 14),
                new Apple(Color.RED, 41)
        );

        Comparator<Apple> sortApple = comparing(apple -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        myInventory.sort(comparing(apple -> apple.getWeight()));
        System.out.println(myInventory);

        myInventory.sort(comparing(Apple::getWeight));
        System.out.println(myInventory);

        // Reversed
        myInventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(myInventory);

        // Chaining
        myInventory.sort(comparing(Apple::getColor)
                .reversed()
                .thenComparing(Apple::getWeight));
        System.out.println(myInventory);
    }
}
