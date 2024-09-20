package com.general.mvc_pattern_using_utility_classes;

public class Student {

    private String firstname;
    private String lastname;
    private int age;

    public Student(String firstname, String lastname, int age) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public String getfirstName() {

        return firstname;
    }

    public String getlastName() {

        return lastname;
    }
}