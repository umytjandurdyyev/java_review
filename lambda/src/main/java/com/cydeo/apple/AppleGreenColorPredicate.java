package com.cydeo.apple;

import com.cydeo.sorting.Color;

public class AppleGreenColorPredicate implements ApplePredicate{


    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
