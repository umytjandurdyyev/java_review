package com.cydeo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProblemSolving {

    public static void main(String[] args) {

        int [] myArray = {2, 7, 9, 11, 0};
        System.out.println(Arrays.toString(twoSumBruteSolve(myArray, 9)));
        System.out.println(Arrays.toString(twoSumWithHashMap(myArray, 9)));
    }

    // Two sum
    // 1. Brute solve
    public static int[] twoSumBruteSolve(int[] array, int target){

        for(int i = 0; i < array.length-1; i++){
            for(int j = i + 1; j < array.length; j++)
                if((array[i] + array[j]) == target) return new int[]{i,j};

        }
        return new int[]{};
    }

    // 2. n * n if one pass possible -> Hashmap O(n)
    public static int[] twoSumWithHashMap(int[] array, int target){

        // Create a HashMap to store the number and its index
        Map<Integer, Integer> myMap = new HashMap<>();

        // iterate an array and put each(value & index) to map
        // Start iterating again
        for(int i = 0; i < array.length; i++){
            int potentialMatch = target - array[i];
            // if potential match is exist in my HashMap then return index
            if (myMap.containsKey(potentialMatch)) return  new int[]{i, myMap.get(potentialMatch)};
            else myMap.put(array[i], i);
        }
        return new int[]{};
    }
}
