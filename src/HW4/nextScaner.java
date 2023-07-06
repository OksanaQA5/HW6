package HW4;

import java.util.Scanner;

public class nextScaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Я тестирую замечательно. Что еще нужно?");
        String input = scanner.next();

        System.out.print("Я");
        String input1 = scanner.next();
        System.out.print("тестирую");
        String input2 = scanner.next();
        System.out.print("замечательно.");
        String input3 = scanner.next();
        System.out.print("Что еще нужно?");
        String input4 = scanner.next();

        String string1 = input;
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next();
        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);
        scanner.close();
    }
}