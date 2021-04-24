package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            String[] expression = sc.nextLine().split(" ");
            calc.setA(Integer.parseInt(expression[0]));
            calc.setOperation(expression[1].charAt(0));
            calc.setB(Integer.parseInt(expression[2]));
            calc.calculate();
            System.out.println("Результат вычислений: " + calc.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}