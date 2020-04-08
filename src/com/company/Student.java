package com.company;

public class Student extends Person {
    int course = 1;

    public Student(int h, String n, int course) {
        super(h, n);
        this.course = course;

    }

    void tell() {
        System.out.println(super.name + "\'s height is "+super.height+" course - "+course);
    }
}
