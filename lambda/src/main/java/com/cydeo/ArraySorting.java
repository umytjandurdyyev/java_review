package com.cydeo;

public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
//        as.sort();

        // Behavior parameterization
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(bs);
        as.sort(qs);
    }

    private  void sort(Sorting sorting){
//        System.out.println("Sorting Array");
        sorting.sort();
    }
}
