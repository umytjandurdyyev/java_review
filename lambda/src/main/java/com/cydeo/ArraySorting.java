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

//        MyLambda myLambda = () -> System.out.println("Sorting the array");
        Sorting myLambda2 = () -> System.out.println("Sorting the array");

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quickSort = () -> System.out.println("Quick sorting");
        as.sort(quickSort);

//        Sorting bubbleSorting = () -> System.out.println("Bubble sorting");
//        as.sort(bubbleSorting);

        // paste directly action
        as.sort(() -> System.out.println("Bubble sorting"));
    }

    private  void sort(Sorting sorting){
//        System.out.println("Sorting Array");
        sorting.sort();
    }
}

//interface MyLambda{
//    void print();
//}