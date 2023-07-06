package HW4;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Я");
        String string1 = scanner.next();

        System.out.print("тестирую");
        String string2 = scanner.next();

        System.out.print("замечательно");
        String string3 = scanner.next();

        System.out.print("Что еще нужно?");
        String string4 = scanner.next();
        string4 += scanner.nextLine(); // Добавляем остаток строки

        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);
        System.out.println("string3: " + string3);
        System.out.println("string4: " + string4);
    }
}