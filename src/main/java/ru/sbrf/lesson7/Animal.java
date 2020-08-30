package ru.sbrf.lesson7;

public interface Animal {
    //    default String say() { return "говорит (?)"; }//    default String swim() { return "плавает (?)"; }
//    default String eat() { return "кушает (?)"; }
//    default String move() { return "двигается (?)"; }
//    default String climb() { return "лазает по деревьям (?)"; }
    String say();

    String swim();

    String eat();

    String move();

    String climb();
}
