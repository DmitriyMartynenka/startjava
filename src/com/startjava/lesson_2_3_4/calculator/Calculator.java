package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char operation;

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
                return Math.addExact(a, b);
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return Math.floorDiv(a, b);
            case '%':
                return a % b;
            case '^':
                double a1 = a;
                double b1 = b;
                return (int)Math.pow(a1, b1);
            default:
                return 0;
        }
    }
}