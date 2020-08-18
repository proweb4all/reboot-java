package ru.sbrf.lesson6;

public class Cat extends Animal {
    protected void description(String name) {
        System.out.print("Кошка " + name + ' ' + say("мяу") + ", ");
        System.out.print(climb("ловко") + ", но " + swim("плохо") + ", ");
        System.out.println(eat("мышей") + " и " + move("по-кошачьи"));
    }
}
