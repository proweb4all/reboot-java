package ru.sbrf.lesson6;

public class Animal {
    protected String say(String sound) {
        return "говорит \"" + sound + '-' + sound + "\"";
    }

    public String swim(String how) {
        return "плавает " + how;
    }

    public String eat(String what) {
        return "кушает " + what;
    }

    public String move(String how) {
        return "двигается " + how;
    }

    public String climb(String how) {
        return "лазает по деревьям " + how;
    }

}

