package com.startjava.lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        for (int i = 0x0033; i < 0x0127; i++) {
            System.out.print((char) i);
        }
    }
}