package HW4;


import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину первой стороны: ");
        int side1 = scanner.nextInt();

        System.out.println("Введите длину второй стороны: ");
        int side2 = scanner.nextInt();

        System.out.println("Введите длину третьей стороны: ");
        int side3 = scanner.nextInt();

        boolean isTriangle = checkTriangle(side1, side2, side3);

        if (isTriangle) {
            System.out.println("Можно построить треугольник.");
        } else {
            System.out.println("Нельзя построить треугольник.");
        }
    }

    public static boolean checkTriangle(int side1, int side2, int side3) {

        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }
}