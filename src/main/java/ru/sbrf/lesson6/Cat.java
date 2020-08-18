package ru.sbrf.lesson6;

public class Cat extends Animal {
    protected String name = "";

    protected String description() {
        return "Кошка " + name + ' ' + say("мяу") + ", " + climb("ловко") + ", но " +
                swim("плохо") + ", " + eat("мышей") + " и " + move("по-кошачьи");
    }
}
