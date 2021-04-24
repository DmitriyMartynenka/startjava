package com.startjava.lesson_2_3_4.game;

public class Player {

    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int findNumber(int index) {
        return numbers[index];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void addNumber(int index, int number) {
        numbers[index] = number;
    }
}