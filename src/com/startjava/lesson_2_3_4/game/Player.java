package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers(int attempt) {
        return Arrays.copyOf(numbers, attempt + 1);
    }

    public int getLastNumber(int index) {
        return numbers[index];
    }

    public void addNumber(int index, int number) {
        numbers[index] = number;
    }

    public void clear(int attempt) {
        Arrays.fill(numbers, 0, attempt,0);
    }
}