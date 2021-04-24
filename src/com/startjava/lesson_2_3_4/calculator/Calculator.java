package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char operation;
    private int result;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int calculate() {
        switch (operation) {
            case '+':
                result = Math.addExact(a, b);
                return result;
            case '-':
                result = a - b;
                return result;
            case '*':
                result = a * b;
                return result;
            case '/':
                result = Math.floorDiv(a, b);
                return result;
            case '%':
                result = a % b;
                return result;
            case '^':
                double a1 = a;
                double b1 = b;
                result = (int)Math.pow(a1, b1);
                return result;
            default:
                System.out.println("Error");
                return result;
        }
    }
}