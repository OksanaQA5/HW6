package HW5;

import java.util.Scanner;

public class WordConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        System.out.println("Введите слова для склеивания (для остановки введите STOP):");

        while (true) {
            String word = sc.nextLine();

            if (word.equalsIgnoreCase("STOP")) {
                break;
            }

            sentence.append(word).append(" ");
        }

        System.out.println("Результат склеивания: " + sentence.toString().trim());
    }
}