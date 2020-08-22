package ru.sbrf.lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Animal ---");
        Animal animal = new Animal();
        System.out.println(animal.say());
        System.out.println(animal.swim());
        System.out.println(animal.eat());
        System.out.println(animal.move());
        System.out.println(animal.climb());

        System.out.println("--- Cat ---");
        Cat cat = new Cat("Мурка");
        System.out.println(cat.description());
        System.out.println(cat.say());
        System.out.println(cat.swim());
        System.out.println(cat.eat());
        System.out.println(cat.move());
        System.out.println(cat.climb());
        Cat cat1 = new Cat();
        System.out.println(cat1.description());
        System.out.println(cat.eat("кузнечиков"));

        System.out.println("--- Dog ---");
        Dog dog = new Dog("Жучка");
        System.out.println(dog.description());
        System.out.println(dog.say());
        System.out.println(dog.swim());
        System.out.println(dog.eat());
        System.out.println(dog.move());
        System.out.println(dog.climb());
        Dog dog1 = new Dog();
        System.out.println(dog1.description());
        System.out.println(dog1.animal.eat("кошек"));

        System.out.println("--- Динамическая диспетчеризация методов ---");
        System.out.println(animal.climb());
        animal = cat;
        System.out.println(animal.climb());
    }
}
