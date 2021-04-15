package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        byte computerNumber = 47;
        byte playerNumber = 50;
        if (computerNumber < 0 || computerNumber > 100){
            System.out.println("Необходимо загадать число в диапазоне (0;100]");
        } else {
            while (computerNumber != playerNumber) {
                if (playerNumber > computerNumber) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                    playerNumber--;
                } else if (playerNumber < computerNumber) {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                    playerNumber++;
                }
            }
            System.out.println("Вы угадали!");
        }
    }
}