package HW6;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let the game begin!");

        while (true) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter a number between 0 and 100: ");
            int guess = scanner.nextInt();
            scanner.nextLine();

            if (guess < secretNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > secretNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        scanner.close();
    }
}