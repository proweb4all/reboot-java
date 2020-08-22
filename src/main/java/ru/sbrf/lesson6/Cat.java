package ru.sbrf.lesson6;
// Наследование

public class Cat extends Animal {
    private String name = "NoName";
    private String saySound = "мяу";
    private String swimHow = "плохо";
    private String eatWhat = "мышей";
    private String moveHow = "по-кошачьи";
    private String climbHow = "ловко";

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    protected String say() {
        return super.say(saySound);
    }

    @Override
    protected String swim() {
        return super.swim(swimHow);
    }

    @Override
    protected String eat() {
        return super.eat(eatWhat);
    }

    @Override
    protected String move() {
        return super.move(moveHow);
    }

    @Override
    protected String climb() {
        return super.climb(climbHow);
    }

    protected String description() {
        return "Кошка " + name + ' ' + say() + ", " + climb() + ", но " +
                swim() + ", " + eat() + " и " + move();
    }
}
