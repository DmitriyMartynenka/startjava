import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Calculator calculator1 = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите первое число");
            calculator1.setA(sc.nextInt());
            System.out.println("Введите знак математической операции");
            calculator1.setOperation(sc.next().charAt(0));
            System.out.println("Введите второе число");
            calculator1.setB(sc.nextInt());
            calculator1.calculate();
            do {
                answer = sc.nextLine();
                if (answer.equals("no") || answer.equals("yes")) {
                    break;
                }
                System.out.println("Хотите продолжить вычисления? [yes/no]:");

            }
            while (!answer.equals("yes") && !answer.equals("no"));
        }
        while (answer.equals("yes"));
    }
}