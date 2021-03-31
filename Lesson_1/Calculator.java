public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        char operation = '^';
        if (operation == '+') {
            int result = a + b;
            System.out.println("Cумма чисел равна " + result);
        } else if (operation == '-') {
            int result = a - b;
            System.out.println("Разность чисел равна " + result);
        } else if (operation == '*') {
            int result = a * b;
            System.out.println("Произведение чисел равно " + result);
        } else if (operation == '/') {
            int result = a / b;
            System.out.println("Частное двух чисел равно " + result);
        } else if (operation == '%') {
            int result = a % b;
            System.out.println("Остаток от деления числа а на число b равен " + result);
        } else if (operation == '^') {
            int exponent = 7;
            if (exponent == 0) {
                System.out.println("Результат возведения числа в 0 степень равен 1");
            } else {
                int result = 1;
                int result1 = 1;
                for (int i = 1; i <= exponent; i++) {
                    result = result * a;
                    result1 = result1 * b;
                }
                System.out.println("Число а в " + exponent + " степени составит " + result);
                System.out.println("Число b в " + exponent + " степени составит " + result1);
            }
        }
    }
}