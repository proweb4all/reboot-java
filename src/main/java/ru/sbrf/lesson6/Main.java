package ru.sbrf.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Мурка";
        System.out.println(cat.description());
        Dog dog = new Dog();
        dog.description("Жучка");
    }
}
