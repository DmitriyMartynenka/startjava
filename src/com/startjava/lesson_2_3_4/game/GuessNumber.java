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
    private int count = 0;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int computerNumber = randomNumber();
        System.out.println("У каждого игрока по 10 попыток");
        for (int i = 0; i < 10; i++) {
            System.out.println("Первый игрок вводит число");
            if (playerGuess(computerNumber, i, player1, FIRST_PLAYER)) break;
            System.out.println("Второй игрок вводит число");
            if (playerGuess(computerNumber, i, player2, SECOND_PLAYER)) break;
            count++;
        }
        printPlayerNumbers(player1);
        printPlayerNumbers(player2);
        System.out.println();
    }

    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    private boolean playerGuess(int computerNumber, int i, Player player, String playerSequence) {
        player.addNumber(i, sc.nextInt());
        if (player.findNumber(i) == computerNumber) {
            System.out.print("Игрок " + player.getName() + " угадал число " +
                    computerNumber + " с " + (i + 1) + " попытки");
            return true;
        } else if (count == 9) {
            System.out.println("У " + playerSequence + " игрока кончились попытки");
        } else if (player.findNumber(i) > computerNumber) {
            System.out.println("Число " + playerSequence + " " + IS_BIGGER);
        } else {
            System.out.println("Число " + playerSequence + " " + IS_LOWER);
        }
        return false;
    }

    private void printPlayerNumbers(Player player) {
        int[] numbersCopy = Arrays.copyOf(player.getNumbers(), (count + 1));
        System.out.print("\nЧисла игрока " + player.getName() + ": ");
        for (int amount : numbersCopy) {
            System.out.print(amount + " ");
        }
    }

    public void playAgain() {
        Arrays.fill(player1.getNumbers(), 0, (count + 1), 0);
        Arrays.fill(player2.getNumbers(), 0, (count + 1), 0);
        count = 0;
    }
}
