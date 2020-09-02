package ru.sbrf.lesson7;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Cat ---");
        Cat cat = new Cat();
        System.out.println(cat.say());
        System.out.println(cat.swim());
        System.out.println(cat.eat());
        System.out.println(cat.move());
        System.out.println(cat.climb());
        System.out.println("--- Dog ---");
        Dog dog = new Dog();
        System.out.println(dog.say());
        System.out.println(dog.swim());
        System.out.println(dog.eat());
        System.out.println(dog.move());
        System.out.println(dog.climb());
    }
}
