package com.cydeo.apple;

public class AppleSimpleFormatter implements AppleFormatter{

    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight()+ " g";
    }
}
