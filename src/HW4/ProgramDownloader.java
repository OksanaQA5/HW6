package HW4;
import java.util.Scanner;
public class ProgramDownloader {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Выберите программу (IntelliJ IDEA, Git, Java):");
            String program = scanner.nextLine();

            System.out.println("Выберите операционную систему (Linux, macOS, Windows):");
            String os = scanner.nextLine();

            String downloadLink = null;
            switch (program) {
                case "IntelliJ IDEA":
                    downloadLink = "https://www.jetbrains.com/idea/download/";
                    break;
                case "Git":
                    downloadLink = "https://git-scm.com/downloads";
                    break;
                case "Java":
                    downloadLink = "https://www.oracle.com/java/technologies/javase-jdk16-downloads.html";
                    break;
                default:
                    System.out.println("Такой программы не существует.");
                    System.exit(0);
            }

            switch (os) {
                case "Linux":
                    System.out.println("Ссылка для скачивания программы \"" + program + "\" для ОС Linux: " + downloadLink);
                    break;
                case "macOS":
                    System.out.println("Ссылка для скачивания программы \"" + program + "\" для ОС macOS: " + downloadLink);
                    break;
                case "Windows":
                    System.out.println("Ссылка для скачивания программы \"" + program + "\" для ОС Windows: " + downloadLink);
                    break;
                default:
                    System.out.println("Такой операционной системы не существует.");
            }
        }
    }