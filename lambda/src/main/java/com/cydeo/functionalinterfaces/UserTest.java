package com.cydeo.functionalinterfaces;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstname("Mike").lastname("Smith").age(33).build());
        users.add(User.builder().firstname("Tom").lastname("Hanks").age(53).build());
        users.add(User.builder().firstname("George").lastname("Eugene").age(49).build());
        users.add(User.builder().firstname("Jimmy").lastname("Fallon").age(61).build());

        System.out.println("Print all elements in the list");
        // Print all elements in the list
        printAllUsers(users, p -> true);

        System.out.println("Print all users that last name starts with E");
        // Print all users that last name starts with E
        printAllUsers(users, user -> user.getLastname().startsWith("E"));
    }

    private static void printAllUsers(List<User> users, Predicate<User> predicate) {
        for(User user : users){
            if(predicate.test(user)) System.out.println(user.toString());
        }
    }
}
