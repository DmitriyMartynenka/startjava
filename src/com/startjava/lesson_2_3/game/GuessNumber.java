package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int computerNumber = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Первый игрок вводит число");
            player1.setNumber(sc.nextInt());
            if (player1.getNumber() == computerNumber) {
                System.out.println("Поздравляю, победил " + player1.getName() + " , загаданное число " + computerNumber);
                break;
            } else if (player1.getNumber() > computerNumber) {
                System.out.println("Число первого игрока больше загаданного компьютером");
            } else {
                System.out.println("Число первого игрока меньше загаданного компьютером");
            }
            System.out.println("Второй игрок вводит число");
            player2.setNumber(sc.nextInt());
            if (player2.getNumber() == computerNumber) {
                System.out.println("Поздравляю, победил " + player2.getName() + " , загаданное число " + computerNumber);
                break;
            } else if (player2.getNumber() > computerNumber) {
                System.out.println("Число второго игрока больше загаданного компьютером");
            } else {
                System.out.println("Число второго игрока меньше загаданного компьютером");
            }
        } while (true);
    }
}
