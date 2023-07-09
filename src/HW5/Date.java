package HW5;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] numbers = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа (индексы):");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        int index3 = scanner.nextInt();

        if (index1 >= 0 && index1 < names.length &&
                index2 >= 0 && index2 < numbers.length &&
                index3 >= 0 && index3 < places.length) {
            String name = names[index1];
            int number = numbers[index2];
            String place = places[index3];
            System.out.println(name + " будет идти в " + place + " в " + number + ":00");
        } else {
            System.out.println("Введены некорректные индексы");
        }
    }
}
