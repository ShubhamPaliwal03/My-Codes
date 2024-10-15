package com.general.mvc_pattern_using_utility_classes;

import java.util.*;

public class StudentDataUtil {

    public static List<Student> getStudents() {

        // create an empty list

        List<Student> students = new ArrayList<>();

        // add sample data

        students.add(new Student("Shubham", "Paliwal", 21));
        students.add(new Student("Tarun", "Verma", 38));

        // return the list

        return students;
    }
}