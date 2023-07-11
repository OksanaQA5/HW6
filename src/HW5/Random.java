package HW5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Random {
    public static void main(String[] args) {
           int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Генерируем случайное число от 0 до 99
        }

       System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int targetNumber = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetNumber) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Число " + targetNumber + " найдено в массиве.");
        } else {
            System.out.println("Число " + targetNumber + " не найдено в массиве.");
        }
    }
}
