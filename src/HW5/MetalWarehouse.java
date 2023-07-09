package HW5;

import java.util.Scanner;

public class MetalWarehouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вес, который может храниться на складе: ");
        int maxCapacity = scanner.nextInt();

        int availableCapacity = maxCapacity;

        while (availableCapacity > 0) {
            System.out.print("Введите вес металла для сдачи (для выхода введите 0): ");
            int metalWeight = scanner.nextInt();

            if (metalWeight == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            if (metalWeight < 5) {
                System.out.println("Невозможно принять металл весом менее 5.");
                continue;
            }

            if (metalWeight > availableCapacity) {
                System.out.println("Недостаточно места на складе. Вес превышает доступную вместимость.");
                continue;
            }

            availableCapacity -= metalWeight;
            System.out.println("Металл принят. Оставшаяся вместимость склада: " + availableCapacity);
        }

        System.out.println("Место на складе закончилось.");
    }
}