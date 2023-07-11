package HW5;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите символ операции (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result = operator == '+' ? num1 + num2
                : operator == '-' ? num1 - num2
                : operator == '*' ? num1 * num2
                : operator == '/' ? num1 / num2
                : operator == '%' ? num1 % num2
                : 0;

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
