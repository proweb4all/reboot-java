package ru.sbrf.lesson6;

public class Dog {
    private Animal dog = new Animal();

    protected void description(String name) {
        System.out.print("Собака " + name + ' ' + dog.say("гав") + ", ");
        System.out.print(dog.climb("плохо") + ", но " + dog.swim("хорошо") + ", ");
        System.out.println(dog.eat("мясо") + " и " + dog.move("быстро"));
    }
}