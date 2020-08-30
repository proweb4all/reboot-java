package ru.sbrf.lesson7;

public class Cat implements Animal {
    public String say() {
        return "говорит \"мяу-мяу\"";
    }

    public String swim() {
        return "плавает плохо";
    }

    public String eat() {
        return "кушает мышей";
    }

    public String move() {
        return "двигается по-кошачьи";
    }

    public String climb() {
        return "лазает по деревьям ловко";
    }
}
