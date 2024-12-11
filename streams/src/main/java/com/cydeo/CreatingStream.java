package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        // Creating Stream from Array
        String[] courses = {"Java", "C#", "Python"};
        Stream<String> courseStream = Arrays.stream(courses);

        // Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java","C++", "Spring");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("C++", 101),
                new Course("Spring", 102),
                new Course("Microservices", 103)
        );

        Stream<Course> mzCourseStream = myCourses.stream();

        // Creating Stream from values
        Stream<Integer> stream = Stream.of(1,2,3,4);

    }
}
