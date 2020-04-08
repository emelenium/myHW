package com.company;

public abstract class Pet {
    String name;
    int age;
    boolean hungry;
    abstract void  voice();
    void food(){
        hungry = true;
    }

}
