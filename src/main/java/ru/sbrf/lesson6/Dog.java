package ru.sbrf.lesson6;

public class Dog extends Animal {
    protected void description(String name) {
        System.out.print("Собака " + name + ' ' + say("гав") + ", ");
        System.out.print(climb("плохо") + ", но " + swim("хорошо") + ", ");
        System.out.println(eat("мясо") + " и " + move("быстро"));
    }
}