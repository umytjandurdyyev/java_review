package com.cydeo.task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, Color.ORANGE));

        // use builder
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).build());
        inventory.add(Orange.builder().color(Color.RED).build());
        inventory.add(Orange.builder().build());

        OrangeFormatter orangeFormatter = (Orange orange) -> "An orange of " + orange.getWeight() + " g";
        prettyPrintOrange(inventory,orangeFormatter);
    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter) {
        for(Orange orange : inventory) {
            System.out.println(formatter.accept(orange));
        }
    }
}
