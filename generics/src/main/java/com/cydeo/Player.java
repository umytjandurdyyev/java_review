package com.cydeo;

public abstract class Player {

    // Why abstract class -> do not want to create an object from this class
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
