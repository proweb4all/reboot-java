package ru.sbrf.lesson;

public class Main {

    public static void main(String[] args) {
        byte a1 = 2;
        short b1 = 3;
        System.out.println("sumByte: " + sumByte(a1, b1));
        int a2 = 2;
        long b2 = 3;
        System.out.println("multInt: " + multInt(a2, b2));
        int a3 = 2;
        int b3 = 3;
        System.out.println("maxInt: " + maxInt(a3, b3));
        char a4 = 'A';
        char b4 = 'B';
        System.out.println("isCharA: " + isCharA(a4) + ", isCharA: " + isCharA(b4));
        char a5 = '9';
        char b5 = 'B';
        System.out.println("isCharNumber: " + isCharNumber(a5) + ", isCharNumber: " + isCharNumber(b5));
        System.out.println("isCharNumber1: " + isCharNumber1(a5) + ", isCharNumber1: " + isCharNumber1(b5));
        printBinary30();
        printBinaryMaxIntValue();
        char a6 = '0';
        System.out.println("charToInt(" + a6 + "): " + charToInt(a6));
        int a7 = 55;
        System.out.println("intToChar(" + a7 + "): " + intToChar(a7));

    }
    public static byte sumByte(byte a, short b) {
        return (byte)(a + b);
    }
    public static int multInt(int a, long b) {
        return (int)(a * b);
    }
    public static int maxInt(int a, int b) {
        return (a > b) ? a : b;
    }
    public static boolean isCharA(char a) {
        return (a == 'A') ? true : false;
    }
    public static boolean isCharNumber(char a) {
        return (a >= 48 && a <= 57) ? true : false;
    }
    public static boolean isCharNumber1(char a) {
        return (Character.isDigit(a)) ? true : false;
    }
    public static void printBinary30() {
        for (int i = 0; i < 31; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }
    public static void printBinaryMaxIntValue() {
        System.out.println("print(MaxIntValue): " + Integer.MAX_VALUE);
        System.out.println("printBinary(MaxIntValue): " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("print(MaxIntValue + 1): " + (Integer.MAX_VALUE + 1));
        System.out.println("printBinary(MaxIntValue + 1): " + Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }
    public static int charToInt(char a) {
        return a;
    }
    public static char intToChar(int a) {
        return (char)a;
    }

}
