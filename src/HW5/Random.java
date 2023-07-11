package HW5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Random {
    public static void main(String[] args) {
        // Создаем массив и заполняем его случайными числами
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Генерируем случайное число от 0 до 99
        }

        // Выводим массив на экран
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Считываем число от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int targetNumber = scanner.nextInt();

        // Проверяем наличие числа в массиве
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetNumber) {
                found = true;
                break;
            }
        }

        // Выводим результат
        if (found) {
            System.out.println("Число " + targetNumber + " найдено в массиве.");
        } else {
            System.out.println("Число " + targetNumber + " не найдено в массиве.");
        }
    }
}