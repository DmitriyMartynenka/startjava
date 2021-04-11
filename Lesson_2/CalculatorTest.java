import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите первое число");
            calc.setA(sc.nextInt());
            System.out.println("Введите знак математической операции");
            calc.setOperation(sc.next().charAt(0));
            System.out.println("Введите второе число");
            calc.setB(sc.nextInt());
            calc.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}