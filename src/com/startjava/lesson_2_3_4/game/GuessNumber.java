package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Scanner sc = new Scanner(System.in);
    private int count;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Компьютер загадывает число");
        int targetNumber = randomNumber();
        System.out.println("У каждого игрока по 10 попыток");
        for (int i = 0; i < 10; i++, count++) {
            if (playerGuess(targetNumber, i, player1)) break;
            if (playerGuess(targetNumber, i, player2)) break;
        }
        printPlayerNumbers(player1);
        printPlayerNumbers(player2);
        System.out.println();
        player1.clear(count);
        player2.clear(count);
        count = 0;
    }

    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    private boolean playerGuess(int targetNumber, int i, Player player) {
        makeMove(player);
        player.addNumber(i, sc.nextInt());
        if (player.getLastNumber(i) == targetNumber) {
            System.out.print("Игрок " + player.getName() + " угадал число " +
                    targetNumber + " с " + (i + 1) + " попытки");
            return true;
        } else if (count == 9) {
            System.out.println("У " + player.getName() + " игрока кончились попытки");
        } else {
            String resultOfComparison = player.getLastNumber(i) > targetNumber ? "больше" : "меньше";
            System.out.println("Число игрока " + resultOfComparison);
        }
        return false;
    }

    private void makeMove(Player player) {
        System.out.println(player.getName() + " делает ход");
    }

    private void printPlayerNumbers(Player player) {
        System.out.print("\nЧисла игрока " + player.getName() + ": ");
        for (int number : player.getNumbers(count)) {
            System.out.print(number + " ");
        }
    }
}
