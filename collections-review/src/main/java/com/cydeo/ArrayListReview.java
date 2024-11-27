package com.cydeo;

import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {
        //Create ArrayList and a class
        List<Student> studentList = new ArrayList<>();

        // Add elements to Arraylist
        studentList.add(new Student(1,"Jose"));
        studentList.add(new Student(2,"Mike"));
        studentList.add(new Student(3,"Ariel"));
        studentList.add(new Student(4,"Taylor"));

        System.out.println(studentList);

        System.out.println(" Printing with for loop ====================================");

        // Iteration on ArrayLists^R
        // 1. For Loop with get(index)
        for(int i=0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

        System.out.println(" Printing with Forward Iterator ====================================");
        // 2. Iterator
        Iterator iter  = studentList.listIterator();

        // Forward Iteration
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println(" Printing with Backward Iterator ====================================");

        // Backwards Iteration
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }

        System.out.println(" Printing with forEach loop ====================================");

        // 3. For Each Loop
        for(Student student : studentList){
            System.out.println(student);
        }

        System.out.println(" Printing with Lambda Function ====================================");

        // 4. Lambda Function
        studentList.forEach(student -> System.out.println(student));

        System.out.println(" Sorting elements in List by Comparator ====================================");

        // Sorting elements in List
        Collections.sort(studentList, new sortByIdDesc());
        System.out.println(studentList);

        Collections.sort(studentList, new sortByNameDesc());
        System.out.println(studentList);

    }
    static class sortByIdDesc implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s2.id- s1.id;
        }

    }

    static class sortByNameDesc implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s2.name.compareToIgnoreCase(s1.name);
        }

    }
}
