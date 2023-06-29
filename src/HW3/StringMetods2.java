package HW3;

public class StringMetods2 {
        public static void main(String[] args) {
            String string = "Testing, is my favourite job";
            String[] words = string.split("\\s+"); // Разбиваем строку на отдельные слова

            // Выводим каждое слово и его длину
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int length = word.length();
                System.out.println("Слово" + (i+1) + " = " + word + ", Длина этого слова = " + length + ".");
            }

            // Проверяем, является ли первое слово длиннее остальных
            boolean isFirstWordLonger = true;
            for (int i = 1; i < words.length; i++) {
                if (words[i].length() > words[0].length()) {
                    isFirstWordLonger = false;
                    break;
                }
            }

            System.out.println(isFirstWordLonger);
        }
    }

