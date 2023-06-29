package HW3;

public class StringMetods3 {
            public static void main(String[] args) {
                String text = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";

                // Разбиваем строку на массив слов
                String[] words = text.split("\\s+");

                int countLowerCaseA = 0;
                int countUpperCaseA = 0;

                // Проходим по каждому слову
                for (String word : words) {
                    // Приводим слово и символ 'a' к нижнему регистру для сравнения
                    String lowerCaseWord = word.toLowerCase();
                    char lowerCaseA = 'a';

                    // Считаем количество символов 'a' в слове с учетом регистра
                    for (char c : lowerCaseWord.toCharArray()) {
                        if (c == lowerCaseA) {
                            countLowerCaseA++;
                        }
                    }

                    // Считаем количество символов 'A' в слове с учетом регистра
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
