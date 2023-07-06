package HW4;

import java.util.Scanner;

public class TernarTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        int difference = number1 > number2 ? number1 - number2 : number2 - number1;
        System.out.println("Разность чисел: " + difference);
    }
}