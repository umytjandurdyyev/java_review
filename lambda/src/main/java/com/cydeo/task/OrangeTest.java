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

        OrangeFormatter orangeFormatter = orange -> "An orange of " + orange.getWeight() + " g";
//        prettyPrintOrange(inventory,orangeFormatter);
        prettyPrintOrange(inventory, orange -> "An orange of " + orange.getWeight() + " g");

        System.out.println("================================");
        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };

        prettyPrintOrange(inventory, fancyFormatter);
    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter) {
        for(Orange orange : inventory) {
            System.out.println(formatter.accept(orange));
        }
    }
}
