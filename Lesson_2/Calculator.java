public class Calculator {

    private int a;
    private int b;
    private char operation;
    private int result;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case '+':
                result = a + b;
                System.out.println("Cумма чисел равна " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Разность чисел равна " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Произведение чисел равно " + result);
                break;
            case '/':
                result = a / b;
                System.out.println("Частное чисел равно " + result);
                break;
            case '%':
                result = a % b;
                System.out.println("Остаток от деления первого числа на второе равен " + result);
                break;
            case '^':
                if (b == 0) {
                    System.out.println("Результат возведения числа в 0 степень равен 1");
                } else {
                    int result = 1;
                    for (int i = 1; i <= b; i++) {
                        result = result * a;
                    }
                    System.out.println("Число " + a + " в " + b + " степени составит " + result);
                }
                break;
            default:
                System.out.println("Error");
        }
    }
}