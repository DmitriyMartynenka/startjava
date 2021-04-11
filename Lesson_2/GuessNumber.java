import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessNumberGame() {
        Random random = new Random();
        int computerNumber = random.nextInt(100) + 1;
        Scanner game = new Scanner(System.in);
        do {
            System.out.println("Первый игрок вводит число");
            player1.setNumber(game.nextInt());
            System.out.println("Второй игрок вводит число");
            player2.setNumber(game.nextInt());
            if (player1.getNumber() == computerNumber || (player1.getNumber() == computerNumber
                     && player2.getNumber() == computerNumber)) {
                System.out.println("Поздравляю, победил " + player1.getName() + " , загаданное число " + computerNumber);
            } else if (player2.getNumber() == computerNumber) {
                System.out.println("Поздравляю, победил " + player2.getName() + " , загаданное число " + computerNumber);
            } else {
                System.out.println("Число не отгадано");
                if (player1.getNumber() > computerNumber) {
                    System.out.println("Число первого игрока больше загаданного компьютером");
                }
                if (player1.getNumber() < computerNumber) {
                    System.out.println("Число первого игрока меньше загаданного компьютером");
                }
                if (player2.getNumber() > computerNumber) {
                    System.out.println("Число второго игрока больше загаданного компьютером");
                }
                if (player2.getNumber() < computerNumber) {
                    System.out.println("Число второго игрока меньше загаданного компьютером");
                }
            }
        } while (player1.getNumber() != computerNumber && player2.getNumber() != computerNumber);
    }
}
