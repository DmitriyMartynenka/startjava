import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(sc.nextLine());
        System.out.println("Игрок 1: " + player1.getName());
        System.out.println("Игрок 2: " + player2.getName());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        //System.out.println(guessNumber.player1.getName());
        //System.out.println(guessNumber.player2.getName());
        String answer;
        do {
            guessNumber.guessNumberGame();
            System.out.println("Хотите продолжить игру? [yes/no]");
            do {
                answer = sc.nextLine();
                if (answer.equals("no") || answer.equals("yes")) {
                    break;
                }
                System.out.println("Хотите продолжить игру? [yes/no]:");

            }
            while (!answer.equals("yes") && !answer.equals("no"));
        }
        while (answer.equals("yes"));
    }
}
