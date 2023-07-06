package HW3;

public class StringMethods3 {
    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";

        String[] words = text.split("\\s+");

        int countLowerCaseA = 0;
        int countUpperCaseA = 0;

        for (String word : words) {

            String lowerCaseWord = word.toLowerCase();
            char lowerCaseA = 'a';

            for (char c : lowerCaseWord.toCharArray()) {
                if (c == lowerCaseA) {
                    countLowerCaseA++;
                }
            }

            for (char c : word.toCharArray()) {
                if (c == 'A') {
                    countUpperCaseA++;
                }
            }
        }

        System.out.println("Количество символов 'a' в тексте (с учетом регистра): " + countLowerCaseA);
        System.out.println("Количество символов 'A' в тексте (с учетом регистра): " + countUpperCaseA);
        System.out.println("Общее количество символов 'a' и 'A' в тексте: " + (countLowerCaseA + countUpperCaseA));
    }
}