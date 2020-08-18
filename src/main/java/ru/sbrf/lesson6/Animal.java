package ru.sbrf.lesson6;

public class Animal {
    protected String say(String sound) {
        return "говорит \"" + sound + '-' + sound + "\"";
    }

    protected String swim(String how) {
        return "плавает " + how;
    }

    protected String eat(String what) {
        return "кушает " + what;
    }

    protected String move(String how) {
        return "двигается " + how;
    }

    protected String climb(String how) {
        return "лазает по деревьям " + how;
    }

}

