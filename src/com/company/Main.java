package com.company;

public class Main {

    public static void main(String[] args) {
        Person vanya = new Person(184);
        vanya.say("Vany");
        System.out.println(vanya.height);
        Person vlad = new Person(172,"VLAD");
        System.out.println(vlad.name+"\'s height is "+vlad.height);

        Car car = new Volvo();
        car.Go();

        Snake snake = new Snake();
        snake.voice();
        GoldenFish goldenFish = new GoldenFish();
        goldenFish.voice();
        System.out.println(goldenFish.hungry);
        goldenFish.food();
        System.out.println(goldenFish.hungry);
    }
}
