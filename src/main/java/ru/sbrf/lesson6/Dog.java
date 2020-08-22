package ru.sbrf.lesson6;
// Агрегирование

public class Dog {
    Animal animal = new Animal();
    private String name = "NoName";
    private String saySound = "гав";
    private String swimHow = "хорошо";
    private String eatWhat = "мясо";
    private String moveHow = "быстро";
    private String climbHow = "плохо";

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    String say() {
        return animal.say(saySound);
    }

    String swim() {
        return animal.swim(swimHow);
    }

    String eat() {
        return animal.eat(eatWhat);
    }

    String move() {
        return animal.move(moveHow);
    }

    String climb() {
        return animal.climb(climbHow);
    }

    String description() {
        return "Собака " + name + ' ' + say() + ", " + climb() + ", но " +
                swim() + ", " + eat() + " и " + move();
    }
}