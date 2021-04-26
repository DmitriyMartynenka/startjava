package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private static final String FIRST_PLAYER = "первого игрока";
    private static final String SECOND_PLAYER = "второго игрока";
    private static final String IS_BIGGER = "больше загаданного компьютером";
    private static final String IS_LOWER = "меньше загаданного компьютером";

    private Player player1;
    private Player player2;
    private Scanner sc = new Scanner(System.in);
    private int count;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int targetNumber = randomNumber();
        System.out.println("У каждого игрока по 10 попыток");
        for (int i = 0; i < 10; i++) {
            System.out.println("Первый игрок вводит число");
            if (playerGuess(targetNumber, i, player1, FIRST_PLAYER)) break;
            System.out.println("Второй игрок вводит число");
            if (playerGuess(targetNumber, i, player2, SECOND_PLAYER)) break;
            count++;
        }
        printPlayerNumbers(player1);
        printPlayerNumbers(player2);
        System.out.println();
        setDefaultValues();
    }

    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    private boolean playerGuess(int targetNumber, int i, Player player, String playerSequence) {
        player.addNumber(i, sc.nextInt());
        if (player.getLastNumber(i) == targetNumber) {
            System.out.print("Игрок " + player.getName() + " угадал число " +
                    targetNumber + " с " + (i + 1) + " попытки");
            return true;
        } else if (count == 9) {
            System.out.println("У " + playerSequence + " игрока кончились попытки");
        } else {
            String comparison = player.getLastNumber(i) > targetNumber ? "Число " + playerSequence + " " + IS_BIGGER :
                    "Число " + playerSequence + " " + IS_LOWER;
            System.out.println(comparison);
        }
        return false;
    }

    private void printPlayerNumbers(Player player) {
        int[] numbers = Arrays.copyOf(player.getNumbers(), (count + 1));
        System.out.print("\nЧисла игрока " + player.getName() + ": ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public void setDefaultValues() {
        Arrays.fill(player1.getNumbers(), 0, (count + 1), 0);
        Arrays.fill(player2.getNumbers(), 0, (count + 1), 0);
        count = 0;
    }
}
