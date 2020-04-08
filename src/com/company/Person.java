package com.company;

public class Person {
    public int height = 180;
    public String name = "Default";
    public void say(String name) {
        System.out.println("Hello, " + name);
    }
    public Person(){

    }
    public Person (int h){
        height = h;
    }
    public Person (int h,String n){
        height = h;
        name = n;
    }
}

abstract class Car {
    int speed;

    abstract void Go();
}

class Volvo extends Car {
    @Override
    void Go() {
        System.out.println("It's Volvo");
    }
}