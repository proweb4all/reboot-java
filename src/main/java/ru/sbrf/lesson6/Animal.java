package ru.sbrf.lesson6;

public class Animal {
    private String saySound = "(?)";
    private String swimHow = "(?)";
    private String eatWhat = "(?)";
    private String moveHow = "(?)";
    private String climbHow = "(?)";

    protected String say() {
        return "говорит \"" + saySound + '-' + saySound + "\"";
    }

    protected String say(String sound) {
        return "говорит \"" + sound + '-' + sound + "\"";
    }

    protected String swim() {
        return "плавает " + swimHow;
    }

    protected String swim(String how) {
        return "плавает " + how;
    }

    protected String eat() {
        return "кушает " + eatWhat;
    }

    protected String eat(String what) {
        return "кушает " + what;
    }

    protected String move() {
        return "двигается " + moveHow;
    }

    protected String move(String how) {
        return "двигается " + how;
    }

    protected String climb() {
        return "лазает по деревьям " + climbHow;
    }

    protected String climb(String how) {
        return "лазает по деревьям " + how;
    }

}

