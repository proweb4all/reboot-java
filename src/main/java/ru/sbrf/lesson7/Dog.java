package ru.sbrf.lesson7;

public class Dog implements Animal {
    public String say() {
        return "говорит \"гав-гав\"";
    }

    public String swim() {
        return "плавает хорошо";
    }

    public String eat() {
        return "кушает мясо";
    }

    public String move() {
        return "двигается быстро";
    }

    public String climb() {
        return "лазает по деревьям плохо";
    }

}
