package com.cydeo;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListExample {

    public static void main(String[] args) {

//        ArrayList items = new ArrayList();
        ArrayList <Integer> items = new ArrayList<Integer>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
//        items.add("apple"); // Trying to add a string to an ArrayList of integers

        printDouble(items);
    }

    private static void printDouble(ArrayList <Integer> items) {
//        for(Object i : items){
//            System.out.println((Integer) i * 2); // casting
//        }
        for(int i : items){
            System.out.println(i * 2);
        }
    }
}
